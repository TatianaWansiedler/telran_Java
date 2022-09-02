/*  Создать новый проект и написать программу рассчитывающую, на сколько увеличится площадь пиццы,
если ее диаметр увеличить на N сантиметров. Подсказка: площадь круга можно вычислить по формуле 3,14RR.
Например: Исходная пицца диаметр 10 см (т.е. R1=10/2=5).
Диаметр новой пиццы 16 см (т.е. R1=16/2=8). Ответ: 122.46*/

public class Main {
    public static void main(String[] args) {


        System.out.println(" Рассчитаем площадь первой пицы зная значение диаметра ");
        int dia1 = 10;
        double rad1 = dia1/2.0;
        double size1 = Math.PI*rad1*rad1;

        System.out.println(" D1  = " + dia1);
        System.out.println(" R1  = D1/2 = " + rad1);
        System.out.println(" S1 = PI*R1*R1 = " + size1);

        System.out.println(" Рассчитаем площадь второй пицы, увеличенной на N см ");
        int n = 6;
        double rad2 = (dia1+n)/2.0;
        //double size2 = Math.PI*rad2*rad2;
        double size2 = Math.PI*Math.pow(rad2,2);

        System.out.println(" N  = " + n);
        System.out.println(" R2  = (D1+N)/2 = " + rad2);
        System.out.println(" S2 = PI*R2*R2 = " + size2);

        System.out.println(" Рассчитаем разницу площадей ");
        double difference = Math.abs(size2 - size1); //модуль числа |-5|=5 Math.abs

        System.out.println(" S2 - S1 = " + difference);
    }
}