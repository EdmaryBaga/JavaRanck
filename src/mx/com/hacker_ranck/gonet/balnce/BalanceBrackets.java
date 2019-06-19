package mx.com.hacker_ranck.gonet.balnce;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalanceBrackets {
	 // Complete the isBalanced function below.
    static String isBalanced(String s) {
    		String sAux=s;
    		char d=sAux.charAt(0);
    		char f= sAux.charAt(sAux.length()-1);
    		if(sAux.length()%2 ==0) {
    			for(int l=0; l<sAux.length()/2;l++) {
    				System.out.println("ini "+sAux.charAt(l));
    				System.out.println("fin "+sAux.charAt((sAux.length()-1)-l));
    				boolean com = compara(sAux.charAt(l), sAux.charAt((sAux.length()-1)-l));
    				if (!com) {
    					return "NO";
    				}
    			}
    			return "YES";
    		}else {

        		return "NO";
    		}
    		
    }
    static boolean compara(char ini, char fin) {
    	if (ini=='{' && fin=='}') {
    		return true;
    	}else if (ini=='(' && fin==')') {
    		return true;
    	}else if(ini=='[' && fin==']') {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/cam06/Desktop/H4ck3rR4nck/HackerRanck/src/diagonal2.txt"));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            System.out.println(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();

}
}    
