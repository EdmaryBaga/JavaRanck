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
    		int[] corchetes= {0,0};
    		int[] parentesis= {0,0};
    		int[] llaves= {0,0};
    		if(sAux.length()%2==0) {
    			for(int l=0; l<sAux.length();l++) {
    				if(s.charAt(l)=='{') {
    					llaves[0]+=1;
    				}else if(s.charAt(l)=='}') {
    					llaves[1]+=1;
    				}else if(s.charAt(l)=='(') {
    					parentesis[0]+=1;
    				}else if(s.charAt(l)==')') {
    					parentesis[1]+=1;
    				}else if(s.charAt(l)=='[') {
    					corchetes[0]+=1;
    				}else if(s.charAt(l)==']') {
    					corchetes[1]+=1;
    				}
    			}
    			return compara(corchetes, parentesis, llaves);
    		}else {
    			return "NO";
    		}
    		
    		
    }
    static String compara(int[] cor, int[] llav, int[] par) {
    	if(cor[0]==cor[1]&& llav[0]==llav[1] && par[0]==par[1]) {
    		return "YES";
    	}
    	else {
    		return "NO";
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
