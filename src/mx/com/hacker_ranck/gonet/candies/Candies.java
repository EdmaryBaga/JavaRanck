package mx.com.hacker_ranck.gonet.candies;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

 class Solution {
	 
	 /*
	  * fun candies(n: Int, arr: Array<Int>): Long {
   var candies = IntArray(arr.size)
   for (a in 0..n-1){
       candies[a] = 1
   }
   for (a in 1..n-1){
       if(arr[a] > arr[a-1]) {
           candies[a] = candies[a-1] + 1
       }
   }
   var fin = n-2
   for (b in 1..n-1){
       if(arr[fin] > arr[fin+1]) {
           if (candies[fin] <= candies[fin+1]){
               candies[fin] = candies[fin+1] + 1
           }
       }
       fin--
   }
   var resul: Long = 0
   for(x in 0..n-1) {
       resul += candies[x]
   }
   return resul
}
	  * */

    // Complete the candies function below.
    static long candies(int n, int[] arr) {
    	long total =0;
    	int[] dulces = new int[n];
    	for(int c:dulces){
    		c=1;
    	}
    	for(int x:dulces) {
    		System.out.println(x);
    	}
       return total; 
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/cam06/Desktop/H4ck3rR4nck/HackerRanck/src/diagonal.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        long result = candies(n, arr);
        System.out.println(result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
