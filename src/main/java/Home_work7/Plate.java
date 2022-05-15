package Home_work7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n, boolean g) {
        if(n<food){
            food -= n;
            g=true;
        }
        else{
            System.out.println("Аппетит кота превышает объем еды в тарелке");
            g=false;
        }
        return g;
    }
    //public boolean decreaseFood1(int n, boolean g) {
        //if(n<food){
            //g= true;
        //}
        //else{
            //g=false;
        //}
        //return g;
    //}
    public void info() {
        System.out.println("plate: " + food);
    }
}
