import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		
		M += C;
		int addH = M / 60;
		M = M - (60*addH);
		
		H += addH;
		H = H%24;
		
		System.out.println(H + " " + M);
		
	}
}