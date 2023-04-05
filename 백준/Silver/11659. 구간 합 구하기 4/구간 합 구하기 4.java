import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int arr[] = new int[N];
		int sum[] = new int[N];
		
		for(int i = 0 ; i < N;i++) {
			arr[i] = sc.nextInt();
			if(i == 0) {
				sum[i] = arr[i];
				continue;
			}
			sum[i] = sum[i-1] + arr[i];
		}
		
		for(int i = 0 ; i < M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 1) {
				System.out.println(sum[b-1]);
				continue;
			}
			System.out.println(sum[b-1] - sum[a-2]);
		}
	}
}