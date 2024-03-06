
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*Задание No1
 Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
 1.если длина массива меньше некоторого заданного минимума, метод возвращает -1 в качестве кода ошибки.
 2.если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
 3.если вместо массива пришел null, метод вернет -3
 4.придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
 Напишите метод, в котором реализуете взаимодействие с пользователем. То есть, этот метод запросит искомое число у пользователя,
 вызовет первый метод, обработает возвращенное значение и покажет читаемый результат пользователю.
 Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
 */


public class Sem_2_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        int element = 5;
        int result = searchElement(arr, element);
//        System.out.println(result);
        if (result == -1){
            System.out.println("Длина массива меньше 3");
        }
        else if (result == -2){
            System.out.println("Искомый элемент не найден");
        }
        else if (result == -3) {
            System.out.println("Массив не передан (null)");
        }
        else {
            System.out.printf("Искомый элемент имеет индекс %d", result);
        }
    }

    public static int searchElement(int[] arr, int element){
        if (arr == null){
            return -3;
        }
        int min_length = 3;
        if (arr.length < min_length){
            return -1;
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == element){
                return i;
            }
        }
        return -2;
    }
}


