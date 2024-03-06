package Sem_2_UseAPI;

/*Задание No1
📌Дано четное число N (>0) и символы c1 и c2.
📌Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.*/
public class Sem_2_1_AlternatingChars {
    public static void main(String[] args) {
        int N = 100_000; // длина строки // ababababab
        char c1 = 'a';
        char c2 = 'b';


//        System.out.println(getAlternatingCharsString(N, c1, c2));
//        System.out.println(getAlternatingCharsSB(N, c1, c2));

        // сравним по времени выполнения
        long start = System.currentTimeMillis();    // long (64-bit-ный int)- объявление переменной
        getAlternatingCharsString(N, c1, c2);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        getAlternatingCharsSB(N, c1, c2);
        System.out.println(System.currentTimeMillis() - start);


    }

    // с помощью String
    public static String getAlternatingCharsString(int N, char c1, char c2) {
        String str = "";
        for (int i = 0; i < N / 2; i++) {
            str += Character.toString(c1) + Character.toString(c2);
        }
        return str;
    }

    // с помощью StringBuilder
    public static String getAlternatingCharsSB(int N, char c1, char c2) {
        StringBuilder sb = new StringBuilder(N);    // если известен размер массива N, то лучше сразу указать в ()
        for (int i = 0; i < N / 2; i++) {
            sb.append(c1).append(c2);
        }
        return sb.toString();   //результат выводим в виде строки.
        // StringBuilder использутся для сборки
    }
}
