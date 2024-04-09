package cp;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes her
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int[] candles = new int[10];
            for (int j = 0; j < 10; j++) {
                candles[j] = sc.nextInt();
            }
            // printarray(candles);
            int min = find_min(candles);
            String ret = "";
            if (min == 0) {
                ret = "1";
                for (int k = 0; k < candles[min] + 1; k++) {
                    ret = ret + '0';
                }
            }
            else {
                for (int k = 0; k < candles[min] + 1; k++) {
                    ret = ret + min;
                }
            }
            System.out.println(ret);




        }

    }
    static int find_min(int[] arr) {
        int min = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
            if (arr[i] == arr[min] && min == 0) {
                min = i;
            }
        }
        return min;
    }
}