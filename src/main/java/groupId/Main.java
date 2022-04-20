package groupId;

public class Main {
    public static void main(String[] args){
        int a = 15;
        int b = 6;
        boolean c = myMetod(a,b);
        System.out.println(c);

    }
    public static boolean myMetod(int a, int b){
        return a+b>=10&&a+b<=20;
    }
}
