package groupId;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)  {
        ChekArrey chekArrey = new ChekArrey();
        String[][] a = {
            {"15","8", "7", "12"},
            {"15","8", "7", "12"},
            {"15","8", "7", "12"},
            {"15","8", "7", "12"}
        };



        String s = Arrays.deepToString(a);
        System.out.println(s);




        try {
            chekArrey.checkSizeSummArrey(a);

        } catch (MyArrayDataException e){
            e.printStackTrace();


        }



    }



}

