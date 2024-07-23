import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[10000001];
        for(int i = 2; i < arr.length;i++) {
            arr[i] = i;
        }

        for(int i = 2; i < Math.sqrt(arr.length);i++) {
            if(arr[i] == 0) {
                continue;
            }

            for(int j = i+i; j < arr.length; j = j+i) {
                arr[j] = 0;
            }
        }

        int i = N;

        while(true) {
            if(arr[i] != 0) {
                int result = arr[i];
                if(isPalindrome(result)) {
                    System.out.println(result);
                    break;
                }
            }
            i++;
        }
    }

    public static boolean isPalindrome(int x) {
        char temp[] = String.valueOf(x).toCharArray();
        int s = 0;
        int e = temp.length - 1;
        while(s < e) {
            if(temp[s] != temp[e]) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}