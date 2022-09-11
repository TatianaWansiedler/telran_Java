//Написать программу, которая выводит на экран таблицу умножения (таблицу Пифагора).
// Естественно, использовать циклы.
public class Main {
    public static void main(String[] args) {
        int i =1;
        int k=1;
        int n=9;
        while (i<=n) {
            k=1;
            while (k<=n) {
                System.out.printf("%2d ",i*k);
                k++;
            }
            System.out.println("");
            i++;
        }

        //с помощью цикла for
//        for (int i=1; i<=9; i++) {
//            for (int k=1; k<=9; k++) {
//                System.out.printf("%2d ",i*k);
//            }
//            System.out.println("");
//        }

    }
}