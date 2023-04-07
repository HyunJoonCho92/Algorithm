import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		
		Arrays.sort(arr);
		// 숫자가 모두 같을 때
		if(arr[0] == arr[1] && arr[1] == arr[2]) {
			System.out.println(10000 + arr[0]*1000);
		}
		// 숫자가 모두 다를 때
		else if(arr[0] != arr[1] && arr[1] != arr[2] && arr[0] != arr[2]) {
			System.out.println(arr[2]*100);
		}
		else{
			System.out.println(1000 + arr[1]*100);
		}
		sc.close();
	}
}