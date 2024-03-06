package Sem_2_UseAPI;

/*Задание No2 📌Напишите метод, который сжимает строку. 📌Пример: вход aaaabbbcdd.*/
public class Sem_2_2_CompressString {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(compressStr(str));
    }

    public static String compressStr(String str) {
        StringBuilder SB = new StringBuilder();
        int count = 1;
        char currentChar = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                SB.append(currentChar).append(count);
                count = 1;
                currentChar = str.charAt(i);
            }
        }
        SB.append(currentChar).append(count);
        return SB.toString();
    }

}
