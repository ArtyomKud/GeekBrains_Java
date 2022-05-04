package Home_work5;

public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int wage;
    private int age;

    public Person(String fullName){
        this(fullName, "-");
    }

    public Person(String fullName, String position){
        this(fullName, position, "-");
    }

    public Person(String fullName, String position, String email){
        this(fullName, position, email, "-");
    }

    public Person(String fullName, String position, String email, String phoneNumber){
        this(fullName, position, email, phoneNumber, 30000);
    }

    public Person(String fullName, String position, String email, String phoneNumber, int wage){
        this(fullName, position, email, phoneNumber, wage, 30);
    }

    public Person(String fullName, String position, String email, String phoneNumber, int wage, int age){
        this.fullName=fullName;
        this.position=position;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.wage=wage;
        setAge(age);

    }

    public void setAge(int age) {
        if (age>0&&age<150){
            this.age = age;
        }
        else {
            System.out.println("Введен некорректный возраст!!!");
        }
    }
    public void print(){
        System.out.println("ФИО:"+this.fullName+"  Должность:"+this.position+"  Email:"+this.email+"  Номер телефона:"+this.phoneNumber+"  Уровень зарплаты:"+ this.wage+"  Возраст:"+this.age);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getAge() {
        return age;
    }
}
