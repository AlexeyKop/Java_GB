import java.util.Scanner;

/*📌Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */
public class Task8_HW {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите строку: ");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        if ("".equals(str)){
            throw new Exception("введена пустая строка!");
        }
        else {
            System.out.println(str);
        }
    }
}
