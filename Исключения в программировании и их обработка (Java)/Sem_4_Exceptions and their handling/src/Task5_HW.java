import java.util.Scanner;

/*📌Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.*/
public class Task5_HW {
    public static void main(String[] args) {
        float inputFloatNumber = inputFloat();
        System.out.println(inputFloatNumber);

    }
    public static float inputFloat (){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите десятичное число: ");
        while (!console.hasNextFloat()) {   // проверяет, что число десятичное (float)
            System.out.println("Это не десятичное число!");
            console.nextLine(); // продолжаем ввод
        }
        return console.nextFloat();
    }
}
