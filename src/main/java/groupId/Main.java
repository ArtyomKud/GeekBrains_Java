package groupId;

import Java_Vol2.Cat;
import Java_Vol2.Human;
import Java_Vol2.Robot;
import sun.net.www.http.Hurryable;

public class Main {
    public static void main(String[] args){
        Cat Pushok = new Cat("Пушок");
        Human Pavel = new Human("Павел");
        Robot T1000 = new Robot("T1000");

        Pushok.run();
        Pavel.run();
        T1000.run();
        Pushok.jump();
        Pavel.jump();
        T1000.jump();






    }
}
