//Написать метод String replace(String str, char oldChar, char newChar)
// который в переданной строке str меняет все символы  oldChar на символы newChar.
// Например: replace(«саша», ‘c’, ‘м’) -> «маша»
public class Main {
    public static void main(String[] args) {
        String str ="саша";
        char oldChar='с';
        char newChar='м';
        String newStr = newStr(str, oldChar, newChar);
        System.out.println(newStr);
        newStr = newStr(newStr(str, oldChar, newChar), 'ш', 'м');
        //здесь я пыталась понять плюсы методов. Поняла как они работают, и что можно задавать новые значения переменных
         //в этой задаче проще было бы, наверное, напитать просто
        //String str1 = str.replace(oldChar,newChar);
        System.out.println(newStr);
    }
    public static String newStr(String str,char oldChar,char newChar){
        String str1 = str.replace(oldChar,newChar);
        return str1;
    }


}