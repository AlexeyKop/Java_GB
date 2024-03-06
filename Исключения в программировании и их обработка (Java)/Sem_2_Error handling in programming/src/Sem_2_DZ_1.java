/*1.Реализуйте 3 метода, чтобы в каждом из них получить разные исключения*/
// Выход за пределы массива.
public class Sem_2_DZ_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        // test_1(arr);
//        test_2(10, 5);
//        int a = 10; int b = 0;
//        System.out.println(test_2(a, b));
        System.out.println(test_3("S12"));
    }
    public static int[] test_1(int[] arr){
        for (int i = 1; i < 5 ; i++) {  // перебираем массив до 5-го элемента, когда у нас массив из 4-х элементов.
            arr[i] = 0;
        }
        return  arr;
    }

    // Деление на 0.
    public static int test_2(int a, int b){
        return a/b;
    }
    // Исключение некорректного пребразования типов
    public static int test_3(String a){
        return Integer.parseInt(a);
    }
}
