import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int M = Integer.parseInt(br.readLine());

        int arr[] = new int[N];

        String temp[] = br.readLine().split(" ");

        for(int i = 0 ; i < N;i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }

        Arrays.sort(arr);

        int count = 0;
        int startIndex = 0;
        int endIndex = N - 1;
        int sum = arr[startIndex] + arr[endIndex];

        while(startIndex < endIndex) {
            if(sum == M) {
                count++;
                startIndex++;
                sum = arr[startIndex] + arr[endIndex];
            }
            else if (sum < M) {
                startIndex++;
                sum = arr[startIndex] + arr[endIndex];
            }
            else if (sum > M) {
                endIndex--;
                sum = arr[startIndex] + arr[endIndex];
            }
        }

        System.out.println(count);
    }
}