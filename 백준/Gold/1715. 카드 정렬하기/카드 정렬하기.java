import javax.swing.*;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0 ; i < N;i++) {
            st = new StringTokenizer(br.readLine());
            int data = Integer.parseInt(st.nextToken());
            pq.add(data);
        }
        
        int data1 = 0;
        int data2 = 0;
        int sum = 0;
        while(pq.size() != 1) {
            data1 = pq.remove();
            data2 = pq.remove();
            sum += data1 + data2;
            pq.add(data1+data2);
            
        }
        System.out.println(sum);

    }
}