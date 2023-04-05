import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numA = sc.nextInt();
		
		if(numA >= 90 && numA <= 100 ) {
			System.out.println("A");
		}
		else if(numA >= 80 && numA <= 89 ) {
			System.out.println("B");
		}
		else if(numA >= 70 && numA <= 79 ) {
			System.out.println("C");
		}
		else if(numA >= 60 && numA <= 69 ) {
			System.out.println("D");
		}
		else{
			System.out.println("F");
		}
	}
}