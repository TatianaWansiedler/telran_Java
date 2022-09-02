//Используя знания об операторе IF, напишите программу, которая выводит на экран большее из 3 чисел.
// Числа заданы в виде переменных num1, num2, num3
public class Main {
    public static void main(String[] args) {
        int num1 = 19;
        int num2 = 100;
        int num3 = 100;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The largest number is " + num1);
        } else {
            if (num2 >= num1 && num2 >= num3) {
                System.out.println("The largest number is " + num2);
            } else {
                System.out.println("The largest number is " + num3);
            }
        }
    }
}