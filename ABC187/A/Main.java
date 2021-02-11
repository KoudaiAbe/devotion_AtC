import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int A_sum = 0;
        int B_sum = 0;

        int x;
        int y;

        while(A > 0){
            x = A % 10;
            A_sum += x;
            A /= 10;
        }

        while(B > 0){
            y = B % 10;
            B_sum += y;
            B /= 10;
        }

        if(A_sum > B_sum){
            System.out.println(A_sum);
        }else{
            System.out.println(B_sum);
        }
    }
}