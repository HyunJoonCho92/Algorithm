import java.util.*;
import java.io.*;


public class Main {

    static boolean visited[];
    static ArrayList<Integer>[] A;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        A = new ArrayList[N+1];

        for(int i = 1; i <= N; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for(int i = 0 ; i < M;i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A[S].add(E);
            A[E].add(S);
        }

        // 정렬
        for(int i = 1; i <= N; i++) {
            Collections.sort(A[i]);
        }

        visited = new boolean[N+1];

        DFS(V);
        System.out.println();

        visited = new boolean[N+1];
        BFS(V);
    }

    public static void DFS(int Node) {
        System.out.print(Node + " ");
        visited[Node] = true;
        for(int i : A[Node]) {
            if(!visited[i]) {
                DFS(i);
            }
        }
    }

    public static void BFS(int Node) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(Node);
        visited[Node] = true;

        while(!q.isEmpty()) {
            int now_Node = q.poll();
            System.out.print(now_Node + " ");

            for(int i : A[now_Node]) {
                if(!visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}