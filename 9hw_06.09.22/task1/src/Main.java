//Tatiana Vanzidler 35-36ma
// Дана строка строка, состоящая из нескольких слов разделенных пробелам,
// необходимо сформировать и вывести на экран строку вида содержащую
// первое и последнее слово исходной строки.
// Примечание: слова разделены одним пробелом, строка не содержит знаков препинания.
// Ограничение: в данной задаче нельзя пользоваться стандартными методам String
// кроме charAt() и length(). Например:
//“Java is a very popular language” ->  “Java language”
public class Main {
    public static void main(String[] args) {
        String str1 ="Java is a very popular language";
        //-----часть 1-----------
        int i = 0;
        String firstWord ="";

        while (i<str1.length() && str1.charAt(i)!=' '){
            firstWord+= str1.charAt(i); // переменная для первого слова до пробела
            i++;
        }
        //------часть 2-----------
        i= str1.length()-1;
        String lastWord = "";
        while (i>=0 && str1.charAt(i)!=' ') {
            lastWord+= str1.charAt(i); //переменная для последнего слова записанного "наоборот"
            i-=1;
        }
        //-------часть 3--------
        String lastWord1="";
        i=lastWord.length()-1;
        while (i>=0) {
            lastWord1+=lastWord.charAt(i); //переменная что бы записать последнее слово в нужном виде
            i-=1;
        }
        System.out.printf("%s %s",firstWord,lastWord1); //выводим
    }
    //это не самый удачный способ, но пока единственное что пришло в голову
}