package Sem_1_Beginning;

public class Sem_1_2 {
    public static void main(String[] args) {

//        System.out.println("Hello World!!!");
//
//        // Date - старый класс для работы со временем
//        // Calendar - старый вариант
//
//        System.out.println(LocalDateTime.now());

        /*
        int[] array = new int[5];
        int[] array1 = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int elem: array1) {
            System.out.println(elem);
        }*/

/*        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        System.out.println(str);*/

        /*Задание No2
 📌Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.*/

        int[] arr = {1, 1, 0, 1, 1, 1, 1, 0};

        int max = getRepeatOnes(arr);

        System.out.println("Max число повторений: " + max);
    }

    private static int getRepeatOnes(int[] arr) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
//                if (max < count) {
//                    max = count;
//                }

//                max = max < count ? count : max;  // тернарный оператор

                max = Math.max(count, max);
            } else {
                count = 0;
            }
        }
        return max;







    }
}
