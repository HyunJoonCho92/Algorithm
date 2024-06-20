import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int M = sc.nextInt();

        int arr[][] = new int[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                arr[i][j] = sc.nextInt();

                arr[i][j] = arr[i][j] + arr[i - 1][j] + arr[i][j - 1] - arr[i - 1][j - 1];
            }
        }

//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <= N; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }


        for (int i = 0; i < M; i++) {
            int startX = sc.nextInt();
            int startY = sc.nextInt();
            int endX = sc.nextInt();
            int endY = sc.nextInt();

            int answer = arr[endX][endY] - arr[endX][startY-1] - arr[startX-1][endY] + arr[startX-1][startY-1];
            System.out.println(answer);
        }

    }
}