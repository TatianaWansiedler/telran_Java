public class Main {
   // Реализовать метод, который создает массив из первых n четных чисел,
    // начиная с заданного числа start.   Например, для заданных n=4, start=21: {22,24,26,28}

    public static void main(String[] args) {

        int[] evenValue = evenValue(4,21); // 22 24 26 28 
        for (int i = 0; i < evenValue.length; i++) {
            System.out.print(evenValue[i]+" ");
        }
        System.out.println();

        int[] evenValue1 = evenValue(6,22);  //22 24 26 28 30 32
        for (int i = 0; i < evenValue1.length; i++) {
            System.out.print(evenValue1[i]+" ");
        }
    }
    public static int[] evenValue (int n, int start) {
        int[] arr= new int[n];
        for (int i = 0; i < arr.length; i++, start+=2) {
            if (start%2!=0) {
                arr[i] = start + 1;
            } else {
                arr[i] = start;   //в этом случае start включается в массив
            }
        }
        return arr;
    }

}