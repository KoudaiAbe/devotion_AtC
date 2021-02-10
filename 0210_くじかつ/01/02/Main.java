import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(A[i] % 2 != 0){
               break;
            }else if(i == n-1){
                A[i] = A[i] / 2;
                i = 0;
                cnt++;
            }else{
                A[i] = A[i] / 2;
            }
        }
        System.out.println(cnt);
    }
}