import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double score[] = new double[N];

        for(int i = 0 ; i < N;i++) {
            score[i] = sc.nextInt();
        }

        double max = 0;
        double sum = 0;

        for(int i = 0 ; i < N;i++) {
            if(score[i] > max) {
                max = score[i];
            }
        }

        for(int i = 0 ; i < N; i++) {
            score[i] = score[i] * 100 / max;
        }

        for(int i= 0; i < N; i++) {
            sum += score[i];
        }

        double average = (double)(sum / N);

        System.out.println(average);

    }
}