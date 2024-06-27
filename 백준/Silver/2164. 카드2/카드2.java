import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0 ; i < N;i++) {
            q.add(i+1);
        }

        while(q.size() > 1) {
            q.poll();
            q.add(q.poll());
        }

        System.out.println(q.peek());

    }
}