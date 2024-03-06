package Sem_5_Map;

import java.util.HashMap;
import java.util.Map;

/*Задание No1
 Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
 Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
 1.повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
 (Например, add - egg изоморфны)
 2.буква может не меняться, а остаться такой же. (Например, note - code)
 Пример 1:
 Input: s = "foo", t = "bar"
 Output: false
 Пример 2:
 Input: s = "paper", t = "title"
 Output: true*/
public class S_5_1_IsomorphicStrings {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        System.out.println(isIsomorphic(s, t));

    }
    public static boolean isIsomorphic (String str1, String str2){
        if (str1.equals(str2)){
            return true;
        }
        if (str1.length() != str2.length()) {
            return false;
        }

        // Input: s = "paper", t = "title"

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) { // 0 1 2 3 4
            char charStr1 = str1.charAt(i);       // p a p e r
            char charStr2 = str2.charAt(i);       // t i t l e

            if (map.containsKey(charStr1)){
                if (map.get(charStr1) != charStr2) {
                    return false;
                }
            }
            else {
                map.put(charStr1, charStr2);  // p : t, a : i, e : l, r : e
            }

        }

        return true;
    }

}
