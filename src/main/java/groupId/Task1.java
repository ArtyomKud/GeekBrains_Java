package groupId;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList(Arrays.asList("Банка", "Котел", "Автомобиль", "Банка", "Светофор", "Кружка", "Глобус", "Игрушка", "Автомобиль", "Розетка", "Светильник", "Подставка", "Подкова", "Тройник", "Телефон", "Светильник","Светильник", "Банка", "Розетка", "Полка", "Шкаф"));

        HashSet <String> list2=new HashSet<>(list);


        HashMap<String, Integer> test = new HashMap<>();

        for (String o: list){
            String str= o;
            Integer n = 1;

            if (test.containsKey(str)) {
                n=test.get(str)+1;
                test.put(o ,n);
            }
           else {
                test.put(o ,n);

            }
        }
        for (Map.Entry<String, Integer> o : test.entrySet()) {
            if(o.getValue()>1){
            System.out.println(o.getKey() + ": " + o.getValue());
            }
        }











    }
}
