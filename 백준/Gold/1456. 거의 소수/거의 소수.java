import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long[] arr = new long[10000001];

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = i;
        }

        for(int i = 2; i <= Math.sqrt(arr.length); i++) {
            if(arr[i] == 0) {
                continue;
            }
            for(int j = i+i; j < arr.length ; j = j+i) {
                arr[j] = 0;
            }
        }

        int count = 0 ;
        for(int i = 2; i < 10000001;i++) {
            if(arr[i] != 0) {
                long temp = arr[i];
                while((double)arr[i] <= (double)B/(double)temp) {
                    if((double)arr[i] >= (double)A/(double)temp) {
                        count++;
                    }
                    temp = temp * arr[i];
                }
            }
        }

        System.out.println(count);

    }
}