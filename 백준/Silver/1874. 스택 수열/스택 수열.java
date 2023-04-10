
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0 ; i < n;i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        int num = 1;
        Queue<String> answer = new LinkedList<>();
        boolean result = true;

        for(int i = 0 ; i < arr.length; i++){

            // num <= arr[i] 이면 계속 push해야함.
            if(num <= arr[i]){
                while(num <= arr[i]){
                    stack.push(num++);
                    answer.add("+");
                }
            }
            //stack.peek == arr[i] 이면 pop
            if(stack.peek() == arr[i]){
                stack.pop();
                answer.add("-");
            }
            //아니면 NO
            else {
                result = false;
                System.out.println("NO");
                break;
            }
        }

        if(result){
            int length = answer.size();
            for(int i = 0; i < length; i++){
                System.out.println(answer.remove());
            }
        }
    }
}