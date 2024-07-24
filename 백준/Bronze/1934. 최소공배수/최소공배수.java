import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int T = Integer.parseInt(st.nextToken());
        
        for(int i = 0 ; i < T;i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            int result = a*b/ gcd(a, b);
            
            System.out.println(result);
        }
    }
    
    public static int gcd(int a, int b) {
        if(b == 0)
            return a;
        
        return gcd(b, a % b);
    }
}