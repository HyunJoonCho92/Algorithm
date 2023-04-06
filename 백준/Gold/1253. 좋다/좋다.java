import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long arr[] = new long[N];

        for(int i = 0 ; i < N;i++){
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        int count = 0;
        int index = 0;

        while(index < N){
            int start = 0;
            int end = N-1;
            while(start < end){
                long sum = arr[start] + arr[end];
                //System.out.println(sum + " " + start + " " + end + " " + count);

                if(start == index){
                    start++;
                }
                else if(end == index){
                    end--;
                }
                else if(arr[index] == sum){
                    count++;
                    break;
                }
                else if(arr[index] < sum){
                    end--;
                }
                else if(arr[index] > sum){
                    start++;
                }
            }
            index++;
        }
        System.out.println(count);

    }
}