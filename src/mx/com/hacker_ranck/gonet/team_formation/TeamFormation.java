package mx.com.hacker_ranck.gonet.team_formation;

import java.io.*;
import java.util.*;
import java.math.*;
import java.security.*;
import java.text.*;


public class TeamFormation {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {

		ArrayList <ArrayList> equipos= new ArrayList();
		int t = scanner.nextInt();
		for(int i=0; i<t;i++) {
			equipos.add(new ArrayList());
		}

		 for (int r = 0; r < t; r++) {
    		int m = scanner.nextInt();
        	equipos.get(r).add(m);
        	scanner.nextLine();
        }
        
		 
        for(int o=0; o<equipos.size();o++) {
        	ArrayList<Integer> aux = new ArrayList<Integer>();
        	aux.addAll(equipos.get(o));
        	
        	for(int x: aux) {
        		System.out.print(x);
        	}
        	System.out.println(" ");
        	
        }
        
        scanner.close();
	}

	private static int Equipos(int s) {
		//System.out.println(s.charAt(0));
		return s;
	}

}
