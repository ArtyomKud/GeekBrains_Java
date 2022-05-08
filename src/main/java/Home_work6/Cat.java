package Home_work6;

public class Cat extends Animal {
    static int summCat;
    final int runLimit=200;

    public Cat(String name) {

        super(name);
        summCat+=1;
    }
    public void run(int a) {
        if (a <= runLimit) {
            System.out.println(getName() + " пробежал " + a + " м");
        } else {
            System.out.println(getName() + " пробежал " + runLimit + " м");
        }
    }


    public void toSail(int b) {
        System.out.println(getName()+" не сможет проплыть "+b+"м т.к. не умеет плавать!!!");

    }

    public static int getSummCat() {
        return summCat;
    }

    public static void setSummCat(int _summCat) {
        summCat = _summCat;

    }


}

