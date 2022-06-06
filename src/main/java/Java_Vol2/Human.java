package Java_Vol2;

public class Human implements List_of_actions{
    private String name;
    private String type = "Человек";

    public Human (String name){
        this.name=name;
    }
    @Override
    public void run(Inventory t) {
        if (t.getPurpose()=="Бегать"){
            System.out.println(type+" "+name+" побегал по "+t.getName());
        }
        else {
            System.out.println(type+" "+name+" не стал бегать по "+t.getName());
        }


    }

    @Override
    public void jump(Inventory p) {
        if (p.getPurpose()=="Перепрыгнуть"){
            System.out.println(type+" "+name+" прыгнул через "+p.getName());
        }
        else {
            System.out.println(type+" "+name+" не стал перепрыгивать через "+p.getName());
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
