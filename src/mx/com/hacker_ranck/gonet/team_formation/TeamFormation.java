package mx.com.hacker_ranck.gonet.team_formation;

import java.io.*;
import java.util.*;
import java.math.*;
import java.security.*;
import java.text.*;


public class TeamFormation {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		ArrayList<ArrayList<Integer>> listaEquipos = new ArrayList<>();
		
		listaEquipos.addAll(recogeDatos());
		for(int p=0; p<listaEquipos.size(); p++) {
			listaEquipos.get(p).sort(new Comparator<Integer>() {
			    @Override
			    public int compare(Integer o1, Integer o2) {
			        return o1.compareTo(o2);
			    }
			});
			//verificaTamEquipoX(listaEquipos.get(0));
				
			for(int x:listaEquipos.get(p) ) {
				System.out.print(x + " ");
			}
			System.out.println(" ");
		}
		
	}
	
	private static int verificaTamEquipoX(int[] equipo) {
		//ArrayList<Integer> le= Arrays.asList(equipo);	
		
		Map<Integer, HashSet<Integer>> lista = new HashMap<>();
		lista.put(1,new HashSet<Integer>());
		HashSet<String> eq = new HashSet<String>();
		int contSubEquipos=1;
		for(int p=0; p<equipo.length; p++) {
			if(!(lista.get(1).contains(equipo[p]))) {
				lista.get(1).add(equipo[p]);
			}
			else {
				contSubEquipos+=1;
				lista.put(contSubEquipos,new HashSet<Integer>());
				lista.get(contSubEquipos).add(equipo[p]);
			}
		}
		for(int p= 0; p<lista.get(1).size(); p++) {
			System.out.println(lista.get(p));
		}
		
		return 0;
	}
	
	public static ArrayList<ArrayList<Integer>> recogeDatos() {
		
		int numEquipos = scanner.nextInt();
		ArrayList<ArrayList<Integer>> listEquipos = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<numEquipos; i++) {
			int tamEquipo = scanner.nextInt();
			ArrayList<Integer> equipoX = new ArrayList<Integer>();
			for (int t=0; t<tamEquipo; t++) {
				if (scanner.hasNextInt()) {
					 do {
						 equipoX.add(scanner.nextInt());
						 break;
						 
					 }while(scanner.hasNextInt());
				 }
			}
			listEquipos.add(equipoX);
		}
		return listEquipos;
	}

}
