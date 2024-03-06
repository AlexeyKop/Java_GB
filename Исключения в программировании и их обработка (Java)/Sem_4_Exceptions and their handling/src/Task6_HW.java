/*📌Если необходимо, исправьте данный код*/
public class Task6_HW {
    public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // создаем целочисленный массив
        int d = 2;
        if (intArray.length - 1 < 8) {   // проверяем размер (длину) массива
            System.out.println("Массив содержит недостаточно элементов!");
        } else if (d == 0) {
            System.out.println("Деление на 0!");
        } else {

            double catchedRes1 = intArray[6] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
//        catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
        //}

    }
}

