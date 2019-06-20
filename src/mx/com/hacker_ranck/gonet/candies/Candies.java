package mx.com.hacker_ranck.gonet.candies;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

 class Solution {

    // Complete the candies function below.
    static long candies(int n, int[] arr) {
    	int[] dulces = new int[n];
    	dulces[0]=1;
    	int contadorDulces=1;
    	for(int p=1; p<arr.length; p++) {
    		if(arr[p-1]<arr[p]) {
    			contadorDulces+=1;
    			dulces[p]=contadorDulces;
    		}
    		else {
    			contadorDulces/=2;
    			dulces[p]=contadorDulces;
    		}	
    	}
    	int total=0;
    	for(int x:dulces) {
    		total+=x;
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
