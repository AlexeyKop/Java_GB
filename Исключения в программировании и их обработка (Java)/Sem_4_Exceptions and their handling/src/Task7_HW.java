/*📌Если необходимо, исправьте данный код*/
public class Task7_HW {
    public static void main(String[] args) throws Exception {
        // try {
            int a = 90;
            int b = 3;
            if (b != 0) {     // добавим проверку на условие
                System.out.println(a / b);
            }

            printSum(23, 234);
            int[] abc = {1, 2};
            if (3 < abc.length) { // обработаем ситуацию с размером массива
                abc[3] = 9;
            }
            else {
                System.out.println("Массив выходит за пределы своего размера!");
            }


//        catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        }

    }

    public static void printSum(Integer a, Integer b) {  // убираем исключение (throws FileNotFoundException)
        System.out.println(a + b);
    }

}
