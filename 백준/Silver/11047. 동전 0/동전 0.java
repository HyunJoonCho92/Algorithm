import javax.swing.*;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int arr[] = new int[N];
        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for(int i = N -1; i >= 0 ; i--) {
            while(K >= arr[i]){
                K = K - arr[i];
                count++;
            }
        }

        System.out.println(count);

    }
}