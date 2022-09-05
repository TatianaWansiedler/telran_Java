//Tatiana Vanzidler 35-36ma
// Дано целое число num. Необходимо написать программу, которая выводит на экран
// таблицу умножения num  до 10. Например, если num=3 то вывод должен быть таким:
//           	3*1=3
//           	3*2=6
//           	3*3=9
//           	-----
//          	3*9=27
//           	3*10=30
public class Main {
    public static void main(String[] args) {
       int num=3;
       int i=1;
       int n=10;

       while (i<=n) {
           System.out.printf(" %d * %2d = %d %n",num,i,num * i);
           i++;
       }
    }
}