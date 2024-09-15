package Ytlectures1;

import java.util.Scanner;

public class Tableof2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number that you want that table:");
	int no=sc.nextInt();
	for(int i=1;i<=10;i++)
	{
		System.out.println(no*i);
	}
	
	}

}
