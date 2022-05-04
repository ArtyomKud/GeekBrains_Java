package Home_work5;


import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {
        Person p1 = new Person("Иванов", "Инженер","a@mil.ru","+79347895689",70000,40);
        Person p2 = new Person("Сидоров","Технолог");
        //p1.print();
        //p2.print();
        Person[] persArrey = new Person[5];
        persArrey[0]=new Person("Петров", "Сантехник", "","", 36000,50);
        persArrey[1]=new Person("Давыдов","Монтажник", "d@mail.ru", "",40000, 30);
        persArrey[2]=new Person("Малышев", "Контролер", "m@mail.ru", "", 20000, 45);
        persArrey[3]= new Person("Зффхаров","Крановщик", "z@mail.ru", "-", 50000, 56);
        persArrey[4]=new Person("Локтев", "Стропальщик", "l@mail.ru", "-", 20000, 23);





    }
}
