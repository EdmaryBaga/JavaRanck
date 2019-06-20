package mx.com.hacker_ranck.gonet.mergelist;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

class Solution {
    // Complete the solve function below.aun faltan casos solo resuelve el de 1  2 2
    static int solve(int n, int m) {
    	 int sum1=0;
         for(int y=0; y<n; y++){
              sum1+=n-y;      
         }
         int sum2=0;
         for(int y=0; y<m; y++){
             sum2+=m-y;      
        }
    	return sum1+sum2;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/cam06/Desktop/H4ck3rR4nck/HackerRanck/src/diagonal.txt"));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            int result = solve(n, m);
            System.out.println(result);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
