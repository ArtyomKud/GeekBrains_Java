package groupId;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Task2 {
    public static void main(String[] args){
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add ("Кудрявцев", "+79237095638");
        telephoneDirectory.add ("Герасимов", "+79838563619");
        telephoneDirectory.add ("Кудрявцев", "+79137068524");
        telephoneDirectory.search("Кудрявцев");



        //System.out.println(telephoneDirectory);

    }

}
