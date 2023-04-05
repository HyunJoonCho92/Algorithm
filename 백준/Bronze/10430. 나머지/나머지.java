import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		int numC = sc.nextInt();
		
		System.out.println((numA+numB) % numC);
		System.out.println(((numA%numC) + (numB%numC)) % numC);
		System.out.println((numA*numB) % numC);
		System.out.println(((numA%numC)*(numB%numC)) % numC);
	}
}