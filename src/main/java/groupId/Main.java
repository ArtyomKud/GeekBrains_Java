package groupId;

import Java_Vol2.*;


public class Main {
    public static void main(String[] args){
        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();
        Cat Pushok = new Cat("Пушок");
        Human Pavel = new Human("Павел");
        Robot T1000 = new Robot("T1000");

        Pushok.run(treadmill);
        Pavel.run(treadmill);
        T1000.run(treadmill);
        Pushok.jump(wall);
        Pavel.jump(wall);
        T1000.jump(wall);








    }
}
