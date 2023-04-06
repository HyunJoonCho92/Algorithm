import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0 ; i < N;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int count = 0;

        for(int i = 0 ; i < N-1;i++){
            for(int j = i+1; j <N;j++){
                if((arr[i]+arr[j]) == M){
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);

    }
}