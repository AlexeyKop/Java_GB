public class Task6_HW_Test2 {
    public static void main(String[] args) {
        int[] intArray;
        int d;

        // Проверяем, переданы ли аргументы командной строки
        if (args.length >= 10) {
            intArray = new int[10];
            for (int i = 0; i < 10; i++) {
                intArray[i] = Integer.parseInt(args[i]);
            }
            d = Integer.parseInt(args[10]);
        } else {
            // Если аргументы не переданы, используем значения по умолчанию
            intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            d = 1;
        }

        // Выполняем вычисления
        double result = expr(intArray, d);

        // Выводим результат
        System.out.println(result);
    }

    public static double expr(int[] intArray, int d) {
        // Проверяем, достаточно ли элементов в массиве
        if (intArray.length < 9) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
            return Double.NaN;
        }

        // Проверяем, равно ли d нулю
        if (d == 0) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
            return Double.NaN;
        }

        // Проверяем, существует ли 8-й элемент в массиве
        if (intArray.length >= 9) {
            int intArrayElement = intArray[8];
            System.out.print("intArray[8] / d = " + intArrayElement + " / " + d + " = " + (double) (intArrayElement / d) + "\n");
            return (double) intArrayElement / d;
        }

        return Double.NaN;
    }
}
