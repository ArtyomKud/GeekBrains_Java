package Home_work6;

public class HomeWork6 {
    public static void main(String[] args) {
        Dog Bobik = new Dog("Бобик");
        Cat Barsik = new Cat("Барсик");
        Cat Murzik = new Cat("Мурзик");
        Cat Poshok = new Cat("Пушок");
        Cat Markiz = new Cat("Маркиз");


        Bobik.run(400);
        Barsik.run(250);
        Murzik.run(3);
        Poshok.run(3);
        Markiz.run(1);

        Bobik.toSail(10);
        Barsik.toSail(2);
        Murzik.toSail(2);
        Poshok.toSail(3);
        Markiz.toSail(1);

        System.out.println("Котов "+Cat.getSummCat()+" шт");
        System.out.println("Собак "+Dog.getSummDog()+" шт");

    }
}
