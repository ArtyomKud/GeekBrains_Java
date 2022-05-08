package Home_work6;

public class Dog extends Animal {
    static int summDog;
    final int toSailLimit= 10;
    final int runLimit=500;
    public Dog(String name) {

        super(name);
        summDog+=1;

    }
    public void run(int a) {
        if (a <= runLimit) {
            System.out.println(getName() + " пробежал " + a + " м");
        } else {
            System.out.println(getName() + " пробежал " + runLimit + " м");
        }
    }

    public void toSail(int b) {
        if (b <= toSailLimit) {
            System.out.println(getName() + " проплыл " + b + " м");
        } else {
            System.out.println(getName() + " проплыл " + toSailLimit + " м");
        }
    }


    public static int getSummDog() {
        return summDog;
    }

    public static void setSummDog(int summDog) {
        Dog.summDog = summDog;
    }




    public int getToSailLimit() {
        return toSailLimit;
    }

    public static int getSummCat() {
        return summDog;
    }
    public static void setSummCat(int _summDog) {
        summDog =_summDog;

    }
}
