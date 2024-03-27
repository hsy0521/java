package Pratice;

import java.util.Scanner;

public class Bj3003 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word=sc.next();
		char[] each=new char[word.length()];
		Boolean pal=true;
		
		for(int i=0; i<word.length();i++) {
			each[i]=word.charAt(i);
		}
		for(int i=0; i<word.length()/2;i++) {
		pal =(pal&&(each[i]==each[word.length()-1-i]));
		}
		if(pal)
			System.out.println("1");
		else
			System.out.println("0");
	}

}
