package Home_work6;

public class Animal {
    private String name;

    public Animal(String name){
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void run(int a){
        System.out.println(name+" пробежал "+ a + " м");
    }
    public void to_sail (int b){
        System.out.println(name+" проплыл "+ b + " м");
    }
}
