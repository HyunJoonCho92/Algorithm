import javax.swing.*;
import java.sql.SQLOutput;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        //StringBuilder 안하면 시간 초과 뜬다

        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] level = new String[N];
        int[] levelSize = new int[N];

        for(int i = 0 ; i < N;i++) {
            st = new StringTokenizer(br.readLine());
            level[i] = st.nextToken();
            levelSize[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0 ; i < M;i++) {
            int num = Integer.parseInt(br.readLine());

            int start = 0;
            int end = N - 1;

            while(start <= end) {
                int mid = (start+end) / 2;

                // num이 levelSize[mid]값 보다 크면
                if(levelSize[mid] < num) {
                    start = mid + 1;
                }
                // num이 levelSize[mid]값 보다 같거나 작으면
                else {
                    end = mid - 1;
                }
            }
            sb.append(level[start]).append("\n");
        }
        System.out.println(sb.toString());
    }
}