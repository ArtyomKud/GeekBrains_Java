package Home_work7;

public class Cat {
    private String name;
    private int appetite;
    private int satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety=0;
    }
    public void eat(Plate p) {
       satiety+=p.decreaseFood(appetite);

    }
    public void checkSatiety (){
        float h = satiety;
        float h1 = appetite;
        if (satiety==appetite){
            System.out.println(name+" сыт!");
        }
        else if (satiety==0){
            System.out.println(name+" голоден!");
        }
        else {
            System.out.println(name+" сыт на "+(h/h1*100)+" %");
        }

    }


}
