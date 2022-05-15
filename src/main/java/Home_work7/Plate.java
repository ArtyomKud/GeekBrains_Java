package Home_work7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if(n<food){
            food -= n;}
        else{
            System.out.println("Аппетит кота превышает объем еды в тарелке");
        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}
