package groupId;

import Home_work7.Cat;
import Home_work7.Plate;

public class Main {
    public static void main(String[] args){
        //Cat cat = new Cat("Barsik", 150);
        Plate plate = new Plate(10);
        Cat[] catArrey=new Cat[5];
        catArrey[0]=new Cat("Pushok",5);
        catArrey[1]=new Cat("Markiz",3);
        catArrey[2]=new Cat("Tom",3);
        catArrey[3]=new Cat("Barsik",7);
        catArrey[4]=new Cat("Antoshka", 8);
        plate.info();
        for (Cat cat : catArrey) {
            cat.eat(plate);
        }
        for (Cat cat : catArrey) {
            cat.checkSatiety();
        }
        plate.info();
        plate.setFood(100);
        plate.info();


    }
}
