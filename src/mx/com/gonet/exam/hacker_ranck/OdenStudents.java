package mx.com.gonet.exam.hacker_ranck;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Checker implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Player p1=(Player)o1;
		Player p2=(Player)o2;
		if(p1.score==p2.score) {
			return p1.name.compareTo(p2.name);
		}else if(p1.name==p2.name) {
			return 1;
		}else {
			return -1;
		}
	}
    
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Student implements Comparable<Student>{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
	@Override
	public int compareTo(Student o) {
				
		if(getCgpa()==o.cgpa) {
			return fname.compareTo(o.fname);
		}else if(fname==o.fname) {
			return id-o.id;
		}else if(cgpa<o.cgpa) {
			return 1;
		}
		else {
			return -1;
		}
	}
}

//Complete the code
class Solution {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
      
		Collections.sort(studentList);
      	for(Student st: studentList){
			System.out.println(st.getFname()+" "+st.getCgpa());
		}
	}
	
}


