import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];

        for(int i = 0 ; i < N;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        StringBuilder sb = new StringBuilder();

        boolean success = true;
        int start = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i < N; i++) {
            while(arr[i] > start){
                start++;
                stack.push(start);
                sb.append("+\n");
            }
            if(arr[i] == stack.peek()) {
                stack.pop();
                sb.append("-\n");
            }
            else {
                success = false;
                break;
            }
        }

        if(success) {
            System.out.println(sb);
        }
        else {
            System.out.println("NO");
        }
    }
}