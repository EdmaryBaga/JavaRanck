package mx.com.hacker_ranck.gonet.exam2.regex;

import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            new MyRegex();
			System.out.println(IP.matches(MyRegex.pattern));
        }

    }
}

class MyRegex{
    public static final String pattern ="^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
}
/**
 * Expresiones regulares:
 * ^ indica el principio del string
 * $ final del string
 * [] Definicion de un conjunto valido
 * ? 0 o 1 ocurrencias
 * */
