package Home_work7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public int decreaseFood(int n) {
        if(n<food){
            food -= n;
        }
        else {
            n=food;
            food-=n;
        }
        return n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void setFood(int food) {
        this.food = food;
    }
}
