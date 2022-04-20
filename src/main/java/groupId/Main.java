package groupId;

public class Main {
    public static void main(String[] args){
        int a = 6;
        int b = 6;
        boolean c = myMetod(a,b);
        System.out.println(c);
        myMetod2(a);
        System.out.println(myMetod3(a));
        int d = 3;
        String i = "Hello world!!!";
        myMetod4(i,d);

    }
    public static boolean myMetod(int a, int b){
        return a+b>=10&&a+b<=20;
    }
    public static void myMetod2(int a){
        if (a<0){
            System.out.println("a отрицательно!");
        }
        else {
            System.out.println("a положительно!");
        }
    }
    public static boolean myMetod3(int a){
        return a<0;
    }
    public static void myMetod4(String text, int a){
        for (int b=0;b<a;b++){
            System.out.println(text);
        }

    }
}
