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

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[1000001];
        arr[0] = 1;
        arr[1] = 1;

        int index = 2;
        while(index <= N) {
            //인덱스가 소수이면 다음꺼
            if(arr[index] == 0) {
                for(int i = index*2; i <= N; i = i+index) {
                    arr[i] = 1;
                }
                index++;
            }
            else if (arr[index] == 1) {
                index++;
            }
        }

        for(int i = M; i <=N; i++) {
            if(arr[i] == 0) {
                System.out.println(i);
            }
        }
    }
}