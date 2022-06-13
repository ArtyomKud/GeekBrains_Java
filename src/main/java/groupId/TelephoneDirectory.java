package groupId;

import com.sun.xml.internal.ws.util.QNameMap;

import java.util.*;

public class TelephoneDirectory extends HashMap {



    public void add(String surname, String phone_number) {
        ArrayList<String> arr = new ArrayList<>();


        if (this.get(surname) == null) {
            arr.add(phone_number);

            this.put(surname, arr);

        } else {
            arr = (ArrayList<String>) this.get(surname);
            arr.add(phone_number);
            this.put(surname, arr);


        }


    }


    public void search(String surname)  {

        try {


            for (Object o : (ArrayList<String>) this.get(surname)) {

                System.out.println(surname + ":" + o);

            }
        } catch (NullPointerException e) {
            System.out.println("Запись не найдена");

        }



    }
}


