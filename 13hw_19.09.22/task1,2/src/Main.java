
public class Main {
    public static void main(String[] args) {

        int[] arr = new int[10];
        createArray(arr, -1,5); // -1 0 1 2 3 4 5 0 0 0
        System.out.println();

        System.out.println("--------level 2-------");
        int[] arr1 = {3, 2, -1, 5, -3}; //  -> 10
        sumArray(arr1);
    }

    /*Реализовать метод, который создает и заполняет массив числами int в диапазоне от minValue до maxValue*/
    public static void createArray (int[] arr, int minValue,int maxValue) {
        for (int i=0; minValue<=maxValue;i++ ){
            arr[i]= minValue++;
        }
        for (int i=0;i<arr.length;i+=1){
            System.out.print(" " + arr[i]);
        }
    }
    /*Дан массив int. Реализовать метод, который считает сумму положительных  элементов массива.
        {3, 2, -1, 5, -3} ->10 */
    public static void sumArray (int[] arr1) {
        int sum=0;
        for (int i=0; i<arr1.length; i++) {
            if (arr1[i] > 0) {
                sum+=arr1[i];
            }
        }
        System.out.println(sum);
    }

}