
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> qu = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            qu.add(i);
        }

        while(qu.size() != 1){
            qu.remove();
            if(qu.size() == 1) break;
            qu.add(qu.remove());

           // System.out.println(qu);
        }

        System.out.println(qu.peek());

    }
}