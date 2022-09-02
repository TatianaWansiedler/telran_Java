//First level: Допустим, у вас есть прибор, у которого есть 3 колбы.
// Каждая колба имеет датчик температуры.
// Считается, что прибор работает правильно,
// если температура в каждой из трех колб не меньше 100 или есть такая колба,
// температура которой более 200 градусов.
// Напишите программу проверки корректности работы такого прибора.

public class Main {
    public static void main(String[] args) {

        int flask1=100;
        int flask2=98;
        int flask3=200;

        boolean runCorrect= (flask1>=100 & flask2>=100  & flask3>=100) | flask1>200 | flask2>200 | flask3>200;

        System.out.println("The device is working correct -" + runCorrect);

    }
}

