//Допустим, у вас есть прибор, у которого есть 3 колбы.
// Каждая колба имеет датчик температуры. Считается, что прибор работает правильно,
// если температура в одной из трех колб (не известно в какой) более 150 градусов, а в остальных менее 100 градусов
// и при этом сумма температур всех трех колб не превышает 250 градусов.

public class Main {
    public static void main(String[] args) {

        int flask1=151;
        int flask2=44;
        int flask3=40;

        //решение 1

        boolean runCorrect1= (flask1 + flask2 + flask3 <= 250) & (flask1 > 150 & flask2 < 100 & flask3 < 100) |
                (flask2 > 150 & flask1 < 100 & flask3 < 100) | (flask3 > 150 & flask1 < 100 & flask2 < 100);

        System.out.println("Solution1: The device is working correct -" + runCorrect1);

        System.out.println("____________________________________________________________________________");

        //решение2 Не смогла решить какое решение правильнее и точное,
        //так как условие "сумма температур менее 250" включает условие "в остальных менее 100 градусов"

        boolean runCorrect2= (flask1 + flask2 + flask3 <= 250) & (flask1 > 150 ^ flask2 > 150 ^ flask3 > 150);

        System.out.println("Solution2: The device is working correct -" + runCorrect2);

    }
}
