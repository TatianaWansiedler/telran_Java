public class Main {
    public static void main(String[] args) {
        //1.
        int[] array = {1, 3, 6, -1, 4, -5, 9};
        System.out.println(minArrayElement(array)); // -> -5

        System.out.println("------------------------------");

        //2.
        String[] array1 = {"qqq", "wwwwwww", "eeee", "rrrrrrr", "hhhhhhhhhhhh", "jjjjjj", "hhhhhhhhhhhh"};
        String[] emptyArray1 = {};
        System.out.println(indexOfMaxStr(array1));         // -> 4
        System.out.println(indexOfMaxStr(emptyArray1));     // если пустой массив -> -1
    }

    //1. Дан массив целых чисел. Реализовать метод, который возвращает минимальное
    // значение в данном массиве.
    public static int minArrayElement(int[] arr) {
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    //2. Дан массив строк. Реализовать метод, который возвращает индекс самой длинной строки в данном массиве.

    //в этом решении,если есть строки с одинаковой длиной, выводится только значение первого индекса самой длинной строки
    // если в условии if (arr[i].length() > maxLengthStr) поставить >= выведет послний индекс
    // как вывести все значения я не придумала.
    public static int indexOfMaxStr(String[] arr) {
        int maxLengthStr = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() > maxLengthStr) {
                maxLengthStr = arr[i].length();
                index = i;
            }
        }
        if (arr.length == 0) {
            return -1;
        } else {
            return index;
        }
    }

}