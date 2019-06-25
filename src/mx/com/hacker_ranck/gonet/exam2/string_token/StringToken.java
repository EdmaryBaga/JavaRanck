package mx.com.hacker_ranck.gonet.exam2.string_token;
import java.io.*;
import java.util.*;

/*
 * Solucion con todos los casos
 * 
 * public class Solution {

     public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       String s=scan.nextLine();
       s.trim();
       StringTokenizer st = new StringTokenizer(s,("[_\\@!?.', ]"));
       int x = st.countTokens();
       System.out.println(x);
       while(st.hasMoreTokens()){
           System.out.println(st.nextToken());
       }
       scan.close();
   }
}

 * */

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
        s.split("[A-Za-z !,?._'@]+");
        System.out.println(s);
        String[] parts =s.split(" ");
        for(String x: parts) {
        	System.out.println(x);
        	x.split("[A-Za-z !,?._'@]+");
        	
        }
        scan.close();
    }
}
