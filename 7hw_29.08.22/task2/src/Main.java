//1.Необходимо написать программу, которая печатает все целые числа в диапазоне  между num1 и num2 включительно.
// Учтите, num1 может быть как меньше, так больше или равно  num2.
//        Например: num1=3   num2=5;   Выводим
//        3
//        4
//        5
//2.В предыдущей задаче, для каждого числа, которое делится на 2 выводить надпись «делиться на 2».
// Для каждого числа, которое делится на 3 выводить надпись «делится на 3»

public class Main {
    public static void main(String[] args) {
        int num1=2;
        int num2=7;

        while (num1<=num2 ^ num1>=num2) {
            if (num1%2==0 && num1%3==0) {
                System.out.printf("number %d  (is divisible by 2 and 3) %n",num1);
            } else if ( num1%2==0 ) {
                System.out.printf("number %d  (is divisible by 2) %n",num1);
            } else if (num1%3==0) {
                System.out.printf("number %d  (is divisible by 3) %n",num1);
            } else {
                System.out.printf("number %d  %n",num1);
            }
            if (num1<=num2) {
                num1=num1+1;
            } else {
                num1=num1-1;}
        }
    }
}


