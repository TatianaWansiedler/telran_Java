//Реализовать мметод String replace(String str, String oldStr, String newStr) который  в данной строке str менет все подстроки oldStr на подстроки newStr Например:
//        ("Hello world!", "world", "all") - "Hello all!"
//        ("Hello world!", "l", "L") - "HeLLo worLd!"
//        ("Hello world!", "qwe", "L") - "Hello world!"
//        ("Hello world!", "ll", "") - "Heo world!"
//        Ограничения: в данной задаче нельзя использовать стандартные методы String, кроме length(), charAt() и equals()

public class Main {
    public static void main(String[] args) {
        String str = "Hello world!";

        System.out.println(replace(str, "world", "all"));       // Hello all!
        System.out.println(str.replace("world", "all"));    // Hello all!
    }


    private static String replace(String str, String oldStr, String newStr) {
        String res = "";

        int strLen = str.length();
        int oldStrLen = oldStr.length();

        if (oldStrLen == 0) {
            for (int i = 0; i <= strLen; i++) {
                res += newStr;
                if (i < strLen) {
                    res += str.charAt(i);
                }
            }
        } else {
            for (int i = 0; i < strLen; i++) {
                boolean found = true;

                for (int j = 0; j < oldStrLen; j++) {
                    if (i + j >= strLen || str.charAt(i + j) != oldStr.charAt(j)) {
                        found = false;
                        break;
                    }

                }

                if (found) {
                    res += newStr;
                    i += oldStrLen - 1;
                } else {
                    res += str.charAt(i);
                }
            }
        }

        return res;
    }

}