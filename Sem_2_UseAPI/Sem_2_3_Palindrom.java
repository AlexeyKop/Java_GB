package Sem_2_UseAPI;

/*Задание No3 📌Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает boolean значение). */
public class Sem_2_3_Palindrom {
    public static void main(String[] args) {
        String str = "q w ertre w q";
        System.out.println(isPalindrom(str));

    }

    public static boolean isPalindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
