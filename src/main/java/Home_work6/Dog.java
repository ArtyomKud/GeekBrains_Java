package Home_work6;

public class Dog extends Animal {
    private int toSailLimit;


    public Dog(String name, int runLimit, int toSailLimit) {

        super(name, runLimit);
        this.toSailLimit=toSailLimit;

    }

    @Override
    public void toSail(int b) {
        if (b <= toSailLimit) {
            System.out.println(getName() + " проплыл " + b + " м");
        } else {
            System.out.println(getName() + " проплыл " + toSailLimit + " м");
        }
    }
    public int getToSailLimit() {
        return toSailLimit;
    }

    public void setToSailLimit(int toSailLimit) {
        this.toSailLimit = toSailLimit;
    }
}
