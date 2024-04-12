import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        for (int i = 0; i < t; i++) {
            String p1 = sc.next().trim();
            // System.out.println(p1);
            String p2 = sc.nextLine().trim();
            // System.out.println(p2);

            int[] map = new int[29];
            for (int ind = 0; ind < p1.length(); ind++) {
                // System.out.println(p1.charAt(ind));
                map[p1.charAt(ind) - 'a']++;
            }

            for (int ind = 0; ind < p2.length(); ind++) {
                map[p2.charAt(ind) - 'a']++;
            }

            int noOfC = sc.nextInt();
            for (int j = 0; j < noOfC; j++) {
                String c = sc.next().trim();
                for (int ind = 0; ind < c.length(); ind++) {
                    map[c.charAt(ind) - 'a']--;
                }
            }
            // break;
            boolean is = true;
            for (int c: map) {
                if (c < 0) {
                    is = false;
                    break;
                }
                
            }
            if (is) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            // break;

        }

 
    }
}
