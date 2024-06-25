import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = sc.nextInt();

        int M = sc.nextInt();
        sc.nextLine(); // 이거 안하면 오류뜬다

        String str = sc.nextLine();

        int answer[] = new int[4]; // A C G T

        for (int i = 0; i < 4; i++) {
            answer[i] = sc.nextInt();
        }

        int count = 0;
        int arr[] = new int[4];

        // 처음 arr[] 설정
        for (int i = 0; i < M; i++) {
            if (str.charAt(i) == 'A') {
                arr[0]++;
            } else if (str.charAt(i) == 'C') {
                arr[1]++;
            } else if (str.charAt(i) == 'G') {
                arr[2]++;
            } else if (str.charAt(i) == 'T') {
                arr[3]++;
            }
        }
        // 첫 비교는 따로
        if(answer[0] <= arr[0] && answer[1] <= arr[1] && answer[2] <= arr[2] && answer[3] <= arr[3]) {
            count++;
        }

        // 전 문자열은 arr에서 빼고, 다음 문자열 arr에 더하기
        for(int i = 1 ; i <= N-M; i++) {
            if (str.charAt(i-1) == 'A') {
                arr[0]--;
            } else if (str.charAt(i-1) == 'C') {
                arr[1]--;
            } else if (str.charAt(i-1) == 'G') {
                arr[2]--;
            } else if (str.charAt(i-1) == 'T') {
                arr[3]--;
            }

            if (str.charAt(i+M-1) == 'A') {
                arr[0]++;
            } else if (str.charAt(i+M-1) == 'C') {
                arr[1]++;
            } else if (str.charAt(i+M-1) == 'G') {
                arr[2]++;
            } else if (str.charAt(i+M-1) == 'T') {
                arr[3]++;
            }

            if(answer[0] <= arr[0] && answer[1] <= arr[1] && answer[2] <= arr[2] && answer[3] <= arr[3]) {
                count++;
            }
        }

        System.out.println(count);
    }
}