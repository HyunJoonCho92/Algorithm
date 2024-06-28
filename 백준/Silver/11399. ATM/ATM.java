import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String temp[] = br.readLine().split(" ");

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }

        Arrays.sort(arr);

        for(int i = 0 ; i < N;i++) {
            if(i == 0)
                continue;
            else
                arr[i] = arr[i-1] + arr[i];
        }

        int sum = 0 ;
        for(int i = 0 ; i < N;i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}