//Представьте, что вы пишите банковскую программу. Вам нужно реализовать метод, который вместо заданной строки с
// номером счета (например ”DE5128279087265”) возвращает строку вида ”DE51*********65”
// (количество звездочек соответствует количеству засекреченных цифр).
// Реализуйте 2 варианта метода: 1) с использованием только циклов, length() и charAt()
// 2) используя любые необходимые методы класса String

public class Main {
    public static void main(String[] args) {
        String accountNumber = "DE5128279087265600";
        System.out.println(hiddenNumber(accountNumber,3));
        System.out.println("--------------------------------------------------");
        System.out.println(hiddenNumber1(accountNumber,4,14));
    }

    public static String hiddenNumber(String accountNumber,int n) {
        //n - количество показанных символов сначала и конца
        String hiddenNumber="";
        char newChar='*';

        for (int i=0; i < accountNumber.length(); i++) {
            if (i > n && i < accountNumber.length()-1-n) {
                hiddenNumber+=newChar;
            } else  {
                hiddenNumber+=accountNumber.charAt(i);
            }
        }
        return hiddenNumber;
    }

    public static String hiddenNumber1(String accountNumber,int start, int end) {
        String needToHide = accountNumber.substring(start,end);
        int length = needToHide.length();
        String hiddenNumber="";

        for (int i =0; i < length; i++) {
            hiddenNumber+="*";
        }
        String hiddenNumber1 = accountNumber.replace(needToHide,hiddenNumber);

        return hiddenNumber1;
    }

}