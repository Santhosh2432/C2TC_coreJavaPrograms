package day1;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int b=sc.nextInt();
		int a[]=new int[b];
	for(int i=0;i<=b-1;i++) {
		System.out.println("Enter a score "+i);
		a[i]=sc.nextInt();
	}
		
		

	}

}
