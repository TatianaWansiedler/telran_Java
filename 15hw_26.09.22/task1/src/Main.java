public class Main {
//    Реализовать метод, который возвращает сколько раз заданное имя встречается в массиве начиная
//    с позиции start до позиции finish (включительно). Если строка не найдена, то возвращаем 0
//    Например:
//    countOccurrence({“jack”, “nick”, “john”,”jack”,”tom”,”john”,”ann”,”john”}, “john”,1,6) ->2
//    countOccurrence({“jack”, “nick”, “john”,”jack”,”tom”,”john”,”ann”,”john”}, “sad”,0,6) ->0
//    countOccurrence({“jack”, “nick”, “john”,”jack”,”tom”,”john”,”ann”,”john”}, “john”,0,7) ->3

    public static void main(String[] args) {
        String[] arrStr ={"jack","nick","john","jack","tom","john","ann","john"};
        System.out.println(countOccurrence(arrStr, "john", 1, 6));
        System.out.println(countOccurrence(arrStr, "sad", 0, 6));
        System.out.println(countOccurrence(arrStr, "john", 0, 7));
    }
    public static int countOccurrence(String[] arrStr, String name, int start, int finish) {
        int counter =0;
        for (int i = start;i <=finish &&  start<arrStr.length && finish< arrStr.length ; i++) {
            if (arrStr[i].equals(name)){
                counter+=1;
            }
        }
        return counter;
    }


}