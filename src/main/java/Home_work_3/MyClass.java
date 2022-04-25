package Home_work_3;

import java.util.Arrays;

public class MyClass {
    public static void main(String[] args) {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 5, 0, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else if (a[i] == 1) {
                a[i] = 0;
            } else {

            }
        }
        System.out.println(Arrays.toString(a));

        int[] b = new int[100];
        for (int i = 0; i < b.length; i++) {
            b[i] += i + 1;
        }
        System.out.println(Arrays.toString(b));
        int[] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < c.length; i++) {
            if (c[i] < 6) {
                c[i] *= 2;
            } else  {
            }

        }
        System.out.println(Arrays.toString(c));
        int [][] d = new int[4][4];
        for(int i=0,j=0,k=3; i< d.length&&j<d[i].length; i++, j++,k--){
            if(i==j||i+k== d.length){
                d[i][j]=1;
                d[i][k]=1;
            }
            else{
            }
        }
        myMetodPrint(d);
        int len = 4;
        int initialValue = 6;
        System.out.println(Arrays.toString(myMetod(len,initialValue)));




        }
        public static void myMetodPrint(int[][] d){
        for(int i=0; i<d.length; i++){
            for(int j = 0; j<d[i].length; j++){
                System.out.print(d[i][j]);
            }
            System.out.println();
        }
    }
    public static int[] myMetod(int a, int b){
        int x[] = new int [a];
        for(int i = 0;i<x.length; i++){
            x[i]=b;

        }
        return x;

    }
}