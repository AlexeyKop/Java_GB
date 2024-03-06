package Sem_4_LinkedList_Queue;

import java.util.Stack;

public class Sem_4_7_HW_CalculatorCancelLastOperate {


    private static class Calculator {
        Stack<Double> history = new Stack<>();  // Стек для хранения истории операций

        public double calculate(char operator, double operand1, double operand2) {
            double result = 0; // Переменная для результата операции
            switch (operator) {
                case '+':
                    result = operand1 + operand2; // Сложение
                    break;
                case '-':
                    result = operand1 - operand2; // Вычитание
                    break;
                case '*':
                    result = operand1 * operand2; // Умножение
                    break;
                case '/':
                    result = operand1 / operand2; // Деление
                    break;
                default:
                    System.out.println("Invalid operator"); // В случае неверного оператора
            }
            history.push(result); // Добавляем результат в стек истории операций
            return result; // Возвращаем результат
        }

        public double undo() {
            if (history.isEmpty()) { // Если стек пустой, нет операций для отмены
                System.out.println("No history to undo");
                return 0;
            }
            // Удаляем последний результат из стека и возвращаем предыдущий
            history.pop();
            if (history.isEmpty()) { // Если стек пуст после удаления, возвращаем 0
                return 0;
            } else {
                return history.peek(); // Возвращаем предыдущий результат из стека
            }
        }

        public static void main(String[] args) {
            Calculator calculator = new Calculator(); // Создаем экземпляр калькулятора

            // Пример использования операций
            System.out.println("Calculate (+): " + calculator.calculate('+', 3, 7)); // 10.0
            System.out.println("Calculate (+): " + calculator.calculate('+', 4, 7)); // 11.0
            System.out.println("Undo: " + calculator.undo()); // 10.0

            System.out.println("Calculate (*): " + calculator.calculate('*', 3, 2)); // 6.0
            System.out.println("Calculate (-): " + calculator.calculate('-', 7, 4)); // 3.0
            System.out.println("Undo: " + calculator.undo()); // 6.0
        }
    }
}
