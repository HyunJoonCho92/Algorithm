import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 번째 줄에서 정수 N을 읽습니다.
        int N = Integer.parseInt(br.readLine());

        // 두 번째 줄에서 N개의 정수를 읽어 배열 A에 저장합니다.
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 A를 정렬합니다.
        Arrays.sort(A);

        // 세 번째 줄에서 정수 M을 읽습니다.
        int M = Integer.parseInt(br.readLine());

        // 네 번째 줄에서 M개의 정수를 읽어 이진 검색을 수행합니다.
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int value = Integer.parseInt(st.nextToken());
            // 이진 검색 결과를 StringBuilder에 추가합니다.
            sb.append(binarySearch(A, value)).append("\n");
        }

        // 결과를 출력합니다.
        System.out.print(sb.toString());
    }

    public static int binarySearch(int[] A, int value) {
        int start = 0;
        int end = A.length - 1;

        while (start <= end) {
            int midIndex = (start + end) / 2;
            int midValue = A[midIndex];

            if (midValue > value) {
                end = midIndex - 1;
            } else if (midValue < value) {
                start = midIndex + 1;
            } else {
                return 1; // 값을 찾은 경우
            }
        }
        return 0; // 값을 찾지 못한 경우
    }
}