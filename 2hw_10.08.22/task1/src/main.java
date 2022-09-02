/* Создать новый проект. Написать программу, в которой задано 2 дробных числа.
Программа должна выводить на экран результат сложения, вычитания, умножения и деления этих чисел.
Например: задано 2 переменных: 10.6 и 2.2  в результате:
10.6 + 2.2=12.8
10.6 - 2.2=8.4
10.6 *2.2=23.32
10.6 / 2.2=4.818181*/

public class main {
    public static void main(String[] args) {

        double num1 = 10.6;
        double num2 = 2.2;

        System.out.println("number1 = " + num1);
        System.out.println("number2 = " + num2);

        System.out.println("number1 + number2 = " + (num1 + num2));
        System.out.println("number1 - number2 = " + (num1 - num2));
        System.out.println("number1 * number2 = " + (num1 * num2));
        System.out.println("number1 / number2 = " + (num1 / num2));
    }
}