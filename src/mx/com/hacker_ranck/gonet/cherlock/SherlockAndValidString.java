package mx.com.hacker_ranck.gonet.cherlock;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution {

	
    // Complete the isValid function below.
    static String isValid(String s) {
    	Map<String,Integer> abcdario= new HashMap<String,Integer>();
    	abcdario.put("g",6);
    	abcdario.put("b", 7);
    	int aux = abcdario.get("g")+1;
    	abcdario.put("g",aux);
    	System.out.println(abcdario.get("g"));

    	return "No";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/cam06/Desktop/H4ck3rR4nck/HackerRanck/src/diagonal.txt"));

        String s = scanner.nextLine();

        String result = isValid(s);
        System.out.println(result);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();
        
        scanner.close();
    }
}