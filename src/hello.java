import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number to check Odd or Even Number : ");
		int num = in.nextInt();
		
		isEven isEven = new isEven() ;
		if(isEven.isEven(num))
		{
			System.out.println("Number "+num+ " is Even.");
		}
		else
		{
			System.out.println("Number "+num+ " is Odd.");
		}
		
	}

}
