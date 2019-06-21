package mx.com.gonet.exam.hacker_ranck;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

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
		double c1 = getCgpa();
		double c2 = o.cgpa;
		
		String n1= getFname();
		String n2 = o.fname;
		
		if(getCgpa()==o.cgpa) {
			return fname.compareTo(o.fname);
		}
		if(id<o.id) {
			return id-o.id;
		}
		return 0;
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
			System.out.println(st.getCgpa());
		}
	}
	
}


