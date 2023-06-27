package ibm_exercises;

import java.io.*;

class Program {

    static long getFactorial(int n) {
        if (n > 9) {
            String stringNum = Integer.toString(n);
            int size = stringNum.length();
            int counter = stringNum.length();
            int first = Integer.parseInt(stringNum.substring(0));
            int last = Integer.parseInt(stringNum.substring(size - 1));
            while (counter > 1) {
                first = first * (counter - 1);
                last = last * (counter - 1);
                counter--;
            }
            return first + last;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getFactorial(23));
    }
}