import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int num[] = new int[N];
		
		for(int i = 0; i < N;i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);
		
		int max = 0;
		int success = 0;
		for(int i = N-1; i >= 2; i--) {
			for(int j = i-1; j >= 1; j--) {
				for(int k = j-1; k >= 0; k--) {
					if(num[i]+num[j]+num[k] <= M) {
						if(max < num[i]+num[j]+num[k]) {
							max = num[i]+num[j]+num[k];
						}
						break;
					}
				}
			}
		}
		
		System.out.println(max);
		
	}
}