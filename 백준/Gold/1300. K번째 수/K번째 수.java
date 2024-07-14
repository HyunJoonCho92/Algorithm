import javax.swing.*;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());

        long start = 1;
        long end = K;
        long ans = 0;

        while(start <= end) {
            long middle = (start + end) / 2;
            long cnt = 0;

            // 중앙값보다 작은 수 계산
            for(int i = 1; i <= N;i++){
                cnt +=Math.min(middle/i, N);
            }

            if(cnt < K) {
                start = middle + 1;
            } else {
                ans = middle;
                end = middle - 1;
            }
        }

        System.out.println(ans);

    }
}