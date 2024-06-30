import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer> A[];
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String temp[] = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int M = Integer.parseInt(temp[1]);

        A = new ArrayList[N+1];
        visited = new boolean[N+1];

        for(int i = 1; i < N+1; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < M;i++) {
            temp = br.readLine().split(" ");
            int start = Integer.parseInt(temp[0]);
            int end = Integer.parseInt(temp[1]);

            A[start].add(end);
            A[end].add(start);
        }

        int count = 0;

        for(int i = 1; i < N + 1; i++) {
            if(!visited[i]) {
                count++;
                DFS(i);
            }
        }

        System.out.println(count);
    }

    static void DFS(int v) {
        if(visited[v]) {
            return;
        }

        visited[v] = true;
        for(int i : A[v]) {
            if(visited[i] == false) {
                DFS(i);
            }
        }
    }
}