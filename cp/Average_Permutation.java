import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t=0;t<T;t++) {
            int n = sc.nextInt();
            System.out.print(n+" "+(n-2)+" ");
            for(int j = 1; j<n-3; j++){
                System.out.print(j+" ");
            }
            System.out.println((n-3)+" "+(n-1));
        }

	}
}
