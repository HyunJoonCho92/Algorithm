import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        String strNum = sc.next();
        char[] cNum = strNum.toCharArray();
        int sum = 0;
        
        for(int i = 0 ; i < cNum.length; i++){
            sum += cNum[i] - '0';
        }
        
        System.out.print(sum);
    }
}