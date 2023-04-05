import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int arr[][] = new int[N+1][N+1];
		int sum[][] = new int[N+1][N+1];
		
		for(int i = 1 ; i <= N;i++) {
			for(int j = 1 ; j <= N ;j++) {
				int num = sc.nextInt();
				sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] + num;
			}
		}
		
		//구간 합 sum 배열에 구하기
//		for(int i = 1; i <= N;i++) {
//			for(int j = 1 ; j <= N ;j++) {
//				if(i == 1) {
//					if(j == 1) {
//						sum[i][j] = arr[i][j];
//					}
//					else {
//						sum[i][j] = sum[i][j-1] + arr[i][j];
//					}
//				}
//				else {
//					if(j == 1 ) {
//						sum[i][j] = sum[i-1][j] + arr[i][j];
//					}
//					else {
//						sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] + arr[i][j];
//					}
//				}
//			}
//		}
		
//		for(int i = 1; i <= N;i++) {
//			for(int j = 1 ; j <= N ;j++) {
//				sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] + arr[i][j];
//			}
//		}
		
		for(int i = 0; i < M;i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();

			System.out.println(sum[x2][y2] - sum[x2][y1-1] - sum[x1-1][y2] + sum[x1-1][y1-1]);
		
		}
	}
}