package Sem_5_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*Задание No2
Часто приводят эту задачу при изучении данных Stack, принцип работа LIFO — "last in — first out" (“последним пришел — первым вышел”)
 Написать программу, определяющую правильность расстановки скобок в выражении.
 Пример 1: a+(d*3) - истина
 Пример 2: [a+(1*3) - ложь
 Пример 3: [6+(3*3)] - истина
 Пример 4: {a}[+]{(d*3)} - истина
 Пример 5: <{a}+{(d*3)}> - истина
 Пример 6: {a+]}{(d*3)} - ложь*/
public class S_5_2_CorrectBrackets {
    public static void main(String[] args) {
        String[] strings = {"a+(d*3)", "[a+(1*3)", "[6+(3*3)]", "{a}[+]{(d*3)}", "<{a}+{(d*3)}>", "{a+]}{(d*3)}"};
        for (String str : strings) {
            boolean res = checkBrackets(str);
            System.out.println(str + " --> " + (res ? "True" : "False"));
        }
    }

    public static Map<Character, Character> getBracketsMap() {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        map.put('>', '<');

        return map;
    }

    public static boolean checkBrackets(String str) {   // [a+(1*3) - ложь
        Map<Character, Character> map = getBracketsMap();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {  // [ a + ( 1 * 3 )
            if (map.containsValue(c)) {
                stack.push(c);              // [ ( ,с помощью stack.pop извлекли '(' ==> [
            } else if (map.containsKey(c)) { // )
                if (stack.isEmpty() || map.get(c) != stack.pop()) {  // ( != (
                                        // map.get(c) - получает значение по ключу 'c' => (
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
