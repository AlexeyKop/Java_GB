/*Задание No4
1.Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2.Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3.В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).*/
public class Task_6_4_2DStringArray {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            int sum = calculateSum(array);
            System.out.println(sum);
        } catch (MyArrayDateException e) {
            System.out.println(e.getMessage());
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }


    public static int calculateSum(String[][] array) throws MyArraySizeException, MyArrayDateException {
        if (array.length != 4 || array[0].length != 4) {    // проверяем размерность массива
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);   // проверяем элеметы массива и накапливаем их
                } catch (NumberFormatException e) {  // можем получить исключение и обработь его
                    throw new MyArrayDateException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}

class MyArraySizeException extends Exception {   // class пользовательского исключения
    public MyArraySizeException() {
        super("Неверный размер массива, надо 4*4");
    }
}

class MyArrayDateException extends Exception {   // class пользовательского исключения
    public MyArrayDateException(String message) {
        super(message);
    }
}

