package Home_work7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety=false;
    }
    public void eat(Plate p) {
       // p.decreaseFood(appetite);
        if(p.decreaseFood(appetite, satiety)){
            System.out.println(name+" сыт.");
        }
    }




}
