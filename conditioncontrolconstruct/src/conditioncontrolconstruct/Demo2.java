package conditioncontrolconstruct;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number");
int marks=scan.nextInt();
System.out.println("Welcome to kodnest");
tech(marks);
	}
public static void tech(int marks)

{
	if (marks>=80)
	{
		System.out.println("Welcome to techclub");
	}
}
}

