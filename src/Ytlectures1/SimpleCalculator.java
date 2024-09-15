package Ytlectures1;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number:");
		int no1=s.nextInt();
		System.out.println("Enter second number:");
		int no2=s.nextInt();
		System.out.println("enter symbol(*,+,-,/)");
		String b=s.next();
		int result;
		switch(b)
		{
		case "+":result=no1+no2;
		System.out.println("addition is "+result);
		break;
		case "-":result=no1-no2;
		System.out.println("subtraction is "+result);
		break;
		case "*":result=no1*no2;
		System.out.println("multiplication is "+result);
		break;
		case "/":result=no1/no2;
		System.out.println("division is "+result);
		}
		
		
	}

}
