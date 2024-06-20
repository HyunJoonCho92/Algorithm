import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int M = sc.nextInt();

        int arr[] = new int[N];
        for(int i = 0 ; i < N;i++) {
            arr[i] = sc.nextInt();
            if(i == 0)
                continue;
            else {
                arr[i] = arr[i] + arr[i-1];
            }
        }

        for(int i = 0 ; i < M;i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            if(start - 2 >= 0)
                System.out.println(arr[end-1] - arr[start-2]);
            else
                System.out.println(arr[end-1]);
        }

    }
}