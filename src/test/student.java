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
			if(score>=80)
				System.out.print("Grade:A");
			else if(score>=75)
				System.out.print("Grade:B+");
			else if(score>=70)
				System.out.print("Grade:B");
			else if(score>=65)
				System.out.print("Grade:C+");
			else if(score>=60)
				System.out.print("Grade:C");
			else if(score>=55)
				System.out.print("Grade:D+");
			else if(score>=50)
				System.out.print("Grade:D");
			else
				System.out.print("Grade:F");
		}
		
	}

}
