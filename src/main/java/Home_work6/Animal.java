package Home_work6;

public class Animal {
    private String name;
    private int runLimit;

    public Animal(String name, int runLimit) {
        this.name = name;
        this.runLimit=runLimit;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int a) {
        if (a <= runLimit) {
            System.out.println(name + " пробежал " + a + " м");
        } else {
            System.out.println(name + " пробежал " + runLimit + " м");
        }
    }
        public void toSail ( int b){
            System.out.println(name + " проплыл " + b + " м");
        }

}

