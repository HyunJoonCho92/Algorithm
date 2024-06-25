import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String M[] = br.readLine().split(" ");

        int arr[] = new int[N];

        for(int i = 0 ; i < N;i++) {
            arr[i] = Integer.parseInt(M[i]);
        }

//        for(int i = 0 ; i < N;i++) {
//            System.out.print(arr[i] + " ");
//        }

        Arrays.sort(arr);

        int count = 0;
        for(int i = 0; i < N; i++) {
            int startIndex = 0;
            int endIndex = N - 1; // endIndex를 i-1로 하면 안됨. - 음수 상황도 생각해야되기 때문에
            int answer = arr[i];
            while(startIndex < endIndex) {
                if(arr[startIndex] + arr[endIndex] == answer) {
                    if(startIndex != i && endIndex != i){
                        count++;
                        break;
                    }
                    // 아래 조건 2개 추가
                    if(startIndex == i) {
                        startIndex++;
                    }
                    if(endIndex == i) {
                        endIndex--;
                    }
                }
                else if(arr[startIndex] + arr[endIndex] < answer) {
                    startIndex++;
                }
                else if(arr[startIndex] + arr[endIndex] > answer) {
                    endIndex--;
                }
            }
        }

        System.out.println(count);
    }
}