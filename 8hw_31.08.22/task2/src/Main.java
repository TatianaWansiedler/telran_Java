//Tatiana Vanzidler 35-36ma
//Дано целое число num. Необходимо написать программу, которая считает,
// сколько разрядов в этом числе. Например:
//           	3 -> 1
//           	343 -> 3
//           	98761 -> 5

public class Main {
    public static void main(String[] args) {
        long num = 123456789;
        long num2 = 1; // число с которым мы сравниваем num
        int length = 0; //разряд числа

        while (num2 <= num) {
            length++;
            num2 *= 10;
        }

        System.out.println(length);

    }
}