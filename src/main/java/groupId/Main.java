package groupId;

import Home_work7.Cat;
import Home_work7.Plate;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat("Barsik", 50);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();


    }
}
