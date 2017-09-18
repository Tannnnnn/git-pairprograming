import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number to find Circle Area : ");
		int num = in.nextInt();
		
		Circle circle = new Circle() ;
		circle.calCircleArea(num);
	}

}
