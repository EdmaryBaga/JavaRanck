package mx.com.hacker_ranck.gonet.cherlock;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution {

	
	/*
	 * select Name, upper(left(Occupation,1)) from OCCUPATIONS ORDER BY Name ASC;
	 * */
	
    // Complete the isValid function below.
    static String isValid(String s) {
    	Map<String,Integer> abcdario= new HashMap<String,Integer>();
    	for(char v : s.toCharArray()) {
    		String key= Character.toString(v);
    		if(!abcdario.containsKey(key)){
    			abcdario.put(key,1);
    		}
    		else {
    			int valorAux= abcdario.get(key)+1;
    			abcdario.put(key,valorAux);
    		}
    	}
    		Set<String> comparador= abcdario.keySet();
    		
    		
    		Object[] arrayClients = (Object[]) comparador.toArray();
    		//System.out.println(arrayClients[0]);
    		int diferentes=0;
    		int valorP = abcdario.get(arrayClients[0]);
    		for(int x:abcdario.values()) {
    			 if(valorP!=x) {
    				 diferentes+=1;
    			}
    			 if(diferentes > 1 || Math.abs(valorP-x)>1) {
    				 return "NO";
    			 }
    		}
    	return "YES";
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