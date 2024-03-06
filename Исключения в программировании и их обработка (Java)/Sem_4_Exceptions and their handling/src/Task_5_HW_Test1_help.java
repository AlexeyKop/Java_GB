
class IsFloat_Help {
    public static float isFloat(String input) {
        try {
            return Float.parseFloat(input);
        } catch (NumberFormatException e) {
            System.out.println("Your input is not a float number. Please, try again.");
            return Float.NaN;
        }
    }

}

public class Task_5_HW_Test1_help {
    public static void main(String[] args) {
        String input;

        if (args.length == 0) {
            input = "3.14"; // По умолчанию используем "3.14", если аргумент не передан
        } else {
            input = args[0];
        }

        float result = IsFloat_Help.isFloat(input);
        System.out.println(result);
    }
}


