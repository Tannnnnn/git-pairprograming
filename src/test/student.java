package test;

import java.util.Scanner;

public class student {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number to check Odd or Even Number : ");
		int score = in.nextInt();
		 
		if(score<0)
		{
			System.out.print("less than");
		}
		else if(score>100)
		{
			System.out.print("more than");
		}
		else
		{
			System.out.print("ok");
		}
		
	}

}
