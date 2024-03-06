import java.util.Arrays;
/*4.Реализуйте метод, принимающий в качестве аргументов два целочисленных массива и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше*/
public class Sem_2_DZ_4 {
    public static void main(String[] args) {
        int[] arr1 = {8, 15, 3};
        int[] arr2 = {4, 5};
         try {
            int[] result = divArrays(arr1, arr2);
            System.out.println(Arrays.toString(result));
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int[] divArrays(int[] arr1, int[] arr2) throws RuntimeException{
        if (arr1.length != arr2.length){
            int[] arr0 = new int[1];
            return arr0;
            // throw new RuntimeException("Массивы имеют разную длину!");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            if (arr2[i] == 0){
                throw new RuntimeException("Деление на 0");
            }
            else {
                result[i] = arr1[i] / arr2[i];
            }
        }
        return result;
    }
}
