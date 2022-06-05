package Java_Vol2;

public class Human implements List_of_actions{
    private String name;
    private String Type = "Человек";

    public Human (String name){
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println(Type + " " + name + " побежал");


    }

    @Override
    public void jump() {
        System.out.println(Type + " " + name + " подпрыгнул");

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
