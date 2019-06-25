package mx.com.hacker_ranck.gonet.team_formation;

/*
 * Falta:
 * 1
	15 1 1 1 2 2 2 3 3 3 4 4 4 5 5 5
	Respuesta:5
 * */

import java.io.*;
import java.util.*;

public class TeamFormation {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		ArrayList<ArrayList<Integer>> listaEquipos = new ArrayList<>();
		
		int tam=0;
		listaEquipos.addAll(recogeDatos());
		if(listaEquipos.size()==0) {
			System.out.println(tam);
		}else {
			for(int p=0; p<listaEquipos.size(); p++) {
				listaEquipos.get(p).sort(new Comparator<Integer>() {
				    @Override
				    public int compare(Integer o1, Integer o2) {
				        return o1.compareTo(o2);
				    }
				});
				tam=verificaTamEquipoX(listaEquipos.get(p));
				System.out.println(tam);
			}
		}
	}
	
	private static int verificaTamEquipoX(ArrayList<Integer> equipo) {
		Map<Integer, HashSet<Integer>> lista = new HashMap<>();
		lista.put(1,new HashSet<Integer>());
		int key=1;
		for(int p=0; p<equipo.size(); p++) {
			
			if(lista.get(key).isEmpty()) {
				lista.get(key).add(equipo.get(p));
			}else if(p==equipo.size()-1) {
				lista.get(key).add(equipo.get(p));
			}
			else if(!(equipo.get(p)+1==equipo.get(p+1)) || equipo.get(p).equals(equipo.get(p+1))) {
				lista.get(key).add(equipo.get(p));
				key+=1;
				lista.put(key,new HashSet<Integer>());
				lista.get(key).add(equipo.get(p+1));
				p+=1;
			}
			else {
				lista.get(key).add(equipo.get(p));
			}
		}
				
		return BuscaElMenorTamaño(lista);
	}
	
	public static int BuscaElMenorTamaño(Map<Integer, HashSet<Integer>> lista) {
		
		int tam=lista.get(1).size();
		for(int o=2; o<=lista.size(); o++) {
			if(tam>lista.get(o).size()) {
				tam= lista.get(o).size();
			}
		}
		return tam;
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
