
class IsFloat {
    public static float isFloat(String input) {
        try {
            // Попробуйте преобразовать введенный текст в float
            return Float.parseFloat(input);
        } catch (NumberFormatException e) {
            // Если не удалось преобразовать введенный текст в float, выведите сообщение об ошибке
            System.out.println("Your input is not a float number. Please, try again.");
            // Затем верните специальное значение, например, Float.NaN, чтобы обозначить ошибку
            return Float.NaN;
        }
    }
}

public class Task_5_HW_Test1 {
    public static void main(String[] args) {
        String input;

        if (args.length == 0) {
            input = "3.14"; // По умолчанию используем "3.14", если аргумент не передан
        } else {
            input = args[0];
        }

        float result = IsFloat.isFloat(input);
        System.out.println(result);
    }
}


