import java.util.Arrays;
/*3.Реализуйте метод, принимающий в качестве аргументов два целочисленных массива и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.*/
public class Sem_2_DZ_3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 8};
        try {
            int[] result = difArrays(arr1, arr2);
            System.out.println(Arrays.toString(result));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int[] difArrays(int[] arr1, int[] arr2) throws IllegalArgumentException{
        if (arr1.length != arr2.length){
            throw new IllegalArgumentException("Массивы имеют разную длину!");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}
