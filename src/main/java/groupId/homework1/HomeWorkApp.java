package groupId.homework1;

public class HomeWorkApp {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 10;
        int b = 15;
        int c = a+b;
        if (c >=0) {
            System.out.println("Сумма положительна");
        }
        else {
            System.out.println("Сумма отрицательна");
        }
    }
    public static void printColor(){
        int value = 30;
        if (value<=0){
            System.out.println("Красный");
        }
        else if (value>0&& value<=100){
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }


        public static void main(String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();



            }




}
