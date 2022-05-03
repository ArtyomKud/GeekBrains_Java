package Home_work5;

public class Person {
    private String fullName;
    private String position;
    private String email;
    private long phoneNumber;
    private long wage;
    private int age;

    public Person(String fullName, String position, String email, long phoneNumber, long wage, int age){
        this.fullName=fullName;
        this.position=position;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.wage=wage;
        setAge(age);

    }

    public void setAge(int age) {
        if (age<0&&age>150){
            this.age = age;
        }
        else {
            System.out.println("Введен некорректный возраст!!!");
        }
    }
}
