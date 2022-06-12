package groupId;

import java.util.Arrays;

public class ChekArrey {

    public void checkSizeSummArrey(String[][] arr) throws MyArrayDataException {
        int n = 0;
        int[][] arr1 = new int[4][4];
        int x = 0;
        int y = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length == 4) {
                    n += 1;
                } else {
                    n -= 1;
                }
            }
            if (arr.length == 4 && n == 4) {

                System.out.println("Массив имеет размер 4х4");
            } else {
                throw new MyArraySizeException();
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    x=i;
                    y=j;
                    arr1[i][j] = Integer.parseInt(arr[i][j]);
                }
            }



            int g = 0;

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                           g += arr1[i][j];

                }
            }

                System.out.println(g);

        } catch(MyArraySizeException e){
                System.out.println("Размер массива не равен 4х4");
            }
        catch (NumberFormatException e){

            throw new MyArrayDataException(x,y);

        }


    }
}
