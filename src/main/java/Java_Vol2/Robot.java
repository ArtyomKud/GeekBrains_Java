package Java_Vol2;

public class Robot implements List_of_actions{
    private String name;
    private String type = "Робот";

    public Robot (String name){
        this.name=name;
    }
    @Override
    public void run(Treadmill t) {
        t.runningInTreadmill(type, name);


    }

    @Override
    public void jump(Wall p) {
        p.jumpOverTheWall(type, name);

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
