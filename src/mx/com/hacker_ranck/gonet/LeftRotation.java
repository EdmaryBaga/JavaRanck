package mx.com.hacker_ranck.gonet;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];
        
        String[] aItems = scanner.nextLine().split(" ");
        
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem; 
           }
    scanner.close();
        
        for (int i=0; i<d; i++) {
            int aux= a[0];
            for(int b=0;b<n; b++){
                
                if(b==a.length-1) {
                    a[b]=aux;
                }else {
                    int asignando= a[b];
                    int asignado= a[b+1];
                    a[b]=a[b+1];
              }
            }
         }
          for(int i=0; i<a.length ;i++){
        System.out.print(a[i]+" "); 
    }
          
          
    }
    
}