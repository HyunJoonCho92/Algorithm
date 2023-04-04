import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int Narr[] = new int[N];
		
		for(int i = 0; i < N;i++) {
			Narr[i] = sc.nextInt();
		}
		
		long sum = 0;
		long max = 0;
		
		for(int i = 0 ; i < N; i++) {
			if(max < Narr[i]) {
				max = Narr[i];
			}
			sum = sum + Narr[i];
		}
		
		System.out.println(sum * 100.0 / max / N);
	}

}
