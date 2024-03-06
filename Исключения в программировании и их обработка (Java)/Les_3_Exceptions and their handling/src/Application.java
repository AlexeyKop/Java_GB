import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // NullPointerException - Обращение к несуществующему объекту
//        String name = null;
//        System.out.println(name.length());

        // ClassCastException - Неверное приведение типов
//        Object object = new String(original: "123");
//        File file = (File) object;
//        System.out.println(file);

        // NumberFormatException Неверное преобразование символьной строки в числовой формат
//        String number = "123fq";
//        int result = Integer.parseInt(number);
//        System.out.println(result);

        // UnsupportedOperationException - Попытка выполнения нереализованного метода
//        List<Object> emptyList = Collections.emptyList();
//        emptyList.add(new Object());

        // try-catch (бросать - ловить)
//        int number = 1;
//        try {
//            number = 10 / 2;
//            String test = null;
//            // System.out.println(test.length());
//            Collections.emptyList().add(new Object());
//        }  catch (ArithmeticException e){
//            System.out.println("operation divide by zero not supported");
//        } catch (NullPointerException e){
//            System.out.println("nullpointer exception");
//        } catch (Exception e){
//            System.out.println("exceptions");
//        }
//        System.out.println(number);


        FileReader test = null;
        try {
            test = new FileReader("test");
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } finally { // finally используется для обязательного закрыттия системных ресурсов
                    // это блок обязательно выполнится по завершении блока try
            System.out.println("finally start");
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("exception while close");
                }
            }
            System.out.println("finally finish");
        }

    }
}
