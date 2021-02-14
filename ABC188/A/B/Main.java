import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Integer A[] = new Integer[N];
        Integer B[] = new Integer[N];

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            B[i] = sc.nextInt();
        }

        //別回答
        int ans = 0;
        for(int i = 0; i < N; i++){
            ans += A[i]*B[i];
        }

        // Integer mult[] = new Integer[N];
        // for(int i = 0; i < N; i++){
        //     mult[i] = A[i]*B[i];
        // }

        // int ans = 0;
        // for(int i = 0; i < N; i++){
        //     ans += mult[i];
        // }

        if(ans == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}