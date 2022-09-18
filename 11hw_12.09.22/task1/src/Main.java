//Написать метод String replace(String str, char oldChar, char newChar)
// который в переданной строке str меняет все символы  oldChar на символы newChar.
// Например: replace(«саша», ‘c’, ‘м’) -> «маша»
public class Main {
    public static void main(String[] args) {
        String str ="саша";
        char oldChar='с';
        char newChar='м';
//        String newStr = newStr(str, oldChar, newChar);
//        System.out.println(newStr);

        System.out.println(newStr1(str, oldChar, newChar));

    }
//    public static String newStr(String str,char oldChar,char newChar) {
//        String str1 = str.replace(oldChar,newChar);
//        return str1;
//    }
    public static String newStr1(String str,char oldChar,char newChar) {
        String str1="";
            for ( int i=0; i < str.length(); i++) {
                    if (str.charAt(i)==oldChar) {
                        str1+=newChar;
                    } else {
                        str1+=str.charAt(i);
                    }
            }
            return str1;
    }


}