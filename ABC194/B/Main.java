import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        // Integer A[] = new Integer[N];
        // Integer B[] = new Integer[N];

        for(int i = 0; i < N; i++){
            A = sc.next();
            // B = sc.nextInt();

            // int A_low = A[i];
            // int B_low = B[i];

            // if(A_low > A[i]){
            //     A_low = A[i];
            //     break;
            // }

            // if(B_low > B[i]){
            //     B_low = B[i];
            //     break;
            // }
            // System.out.println(A_low);
        }

        System.out.println(A);

        // for(int i = 0; i < N; i++){
        //     if(B_low > B[i]){
        //         B_low = B[i];
        //     }
        // }

        // int time = A_low + B_low;
        // System.out.println(time);
        // System.out.println(B[0]);
        // System.out.println(B[1]);
        // System.out.println(B[2]);

        // System.out.println(A[0]);
        // System.out.println(A[1]);
        // System.out.println(A[2]);

        // if(time < B[1]){
        //     System.out.println(time);
        // }else{
        //     if(A[1] > B[1]){
        //         System.out.println(B[1]);
        //     }else{
        //         System.out.println(A[1]);
        //     }
        // }
    }
}