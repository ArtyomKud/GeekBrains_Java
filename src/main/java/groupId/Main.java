package groupId;

import Java_Vol2.*;


public class Main {

    public static void main(String[] args) {
        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();

        List_of_actions[] participant = new List_of_actions[6];
        participant[0] = new Cat("Пушок");
        participant[1] = new Human("Петя");
        participant[2] = new Robot("T1000");
        participant[3] = new Cat("Барсик");
        participant[4] = new Human("Витя");
        participant[5] = new Robot("T2000");

        Inventory[] obstacles = new Inventory[3];
        obstacles[0] = new Treadmill();
        obstacles[1] = new Wall();
        obstacles[2] = new Treadmill();

        for (int i = 0; i < participant.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                participant[i].jump(obstacles[j]);
                participant[i].run(obstacles[j]);
            }


        }


    }
}

