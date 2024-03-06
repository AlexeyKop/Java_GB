package Sem_3_JAVA_intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*Задание No3
 📌Создать список типа ArrayList<String>.
 📌Поместить в него как строки, так и целые числа.
 📌Пройти по списку, найти и удалить целые числа.*/
public class Sem_3_3_FindDeleteIntegers {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("privet", "123", "hello", "456", "world"));
        // deleteNumber(strList);
        deleteNumberIter(strList);
        System.out.println(strList);
    }

    private static void deleteNumberIter(ArrayList<String> strList) {
        Iterator<String> iter = strList.iterator();
        while (iter.hasNext()){
            String elem = iter.next();
            if(isNumber(elem)) iter.remove();
        }
    }

    private static void deleteNumber(ArrayList<String> strList) {
        for (int i = 0; i < strList.size(); i++) {
            if (isNumber(strList.get(i))) {
                strList.remove(i);
                i--;
            }
        }
    }

    public static boolean isNumber(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}
