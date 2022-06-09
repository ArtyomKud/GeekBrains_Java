package groupId;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args){
        String[][] a = new String[4][4];

        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]="A";

            }

        }


        String s = Arrays.deepToString(a);
        System.out.println(s);
        checkSizeArrey(a);

    }



    public static void checkSizeArrey (String[][] arr){
        int n = 0;
        try {
            for (int i = 0; i < arr.length ; i++) {
                if (arr[i].length==4){
                    n +=1;
                }
                else{
                    n-=1;
                }
            }
            if(arr.length==4 && n==4){

                System.out.println("Массив имеет размер 4х4");
            }
            else {
                throw new MyArraySizeException();
            }

        }
        catch (MyArraySizeException e){
            System.out.println("Размер массива не равен 4х4");
        }

    }

}

