package Home_work_3;

import java.util.Arrays;

public class MyClass {
    public static void main(String[] args) {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 5, 0, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            }
            else if (a[i] == 1) {
                a[i] = 0;
            }
            else {

            }
        }
            System.out.println(Arrays.toString(a));

        int[] b = new int[100];
        for(int i =0; i<b.length;i++){
            b[i]+=i+1;
        }
        System.out.println(Arrays.toString(b));

    }
}