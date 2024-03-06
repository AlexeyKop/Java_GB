package Lesson_06_ManySetСollections.part1;

import java.util.*;

public class Ex002_MathSet {
    public static void main(String[] args) {
        var a = new HashSet<>(Arrays.asList(1, 1, 2, 2, 3, 4, 5, 6, 7));
        var b = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17));
        var u = new HashSet<Integer>(a);
        u.addAll(b);   // объединение множеств
        var r = new HashSet<Integer>(a);
        r.retainAll(b); // пересечение множеств
        var s = new HashSet<Integer>(a);
        s.removeAll(b); // разность множеств
        System.out.println("a: " + a); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println("b: " + b); // [17, 2, 3, 5, 7, 11]
        System.out.println("u.addAll(b): " + u + u.addAll(b)); // [1, 17, 2, 3, 4, 5, 6, 11]
        System.out.println("r.retainAll(b): " + r); // [2, 3, 5, 7]
        System.out.println("s.removeAll(b): " + s); // [1, 4, 6]

        System.out.println("a.addAll(b): " + a.addAll(b));
    }
}