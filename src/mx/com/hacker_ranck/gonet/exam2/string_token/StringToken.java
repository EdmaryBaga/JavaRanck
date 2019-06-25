package mx.com.hacker_ranck.gonet.exam2.string_token;
import java.io.*;
import java.util.*;

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
