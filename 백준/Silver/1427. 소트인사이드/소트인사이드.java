import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int arr[] = new int[str.length()];
        for(int i = 0 ; i < str.length(); i++){
            arr[i] = Integer.parseInt(str.substring(i, i+1));
//            System.out.print(str.charAt(i)+" ");
//            System.out.print(arr[i]+" ");
        }

        for(int i = 0 ; i < arr.length - 1;i++){
            int maxIndex = i;
            for(int j = i+1; j <arr.length; j++){
                if(arr[maxIndex] <= arr[j]){
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}