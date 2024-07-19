import javax.swing.*;
import java.sql.SQLOutput;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();

        String strArr[] = str.split("-");

        int answer =0;
        for(int i = 0 ; i < strArr.length ; i++){
            int sum = 0;
            String temp[] = strArr[i].split("[+]"); // +는 특수 문자이므로 [+]이렇게 해야 문자로 인식함.
            for(int j = 0 ; j < temp.length ; j++){
                sum += Integer.parseInt(temp[j]);
            }

            if(i == 0) {
                answer += sum;
            }
            else {
                answer -= sum;
            }
        }

        System.out.println(answer);


    }
}