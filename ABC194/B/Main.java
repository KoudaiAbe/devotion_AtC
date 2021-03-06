import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        Integer A[] = new Integer[N];
        Integer B[] = new Integer[N];

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;

        for(int i = 0;i < N;i++){
            for(int j = 0;j < N;j++){
                if(i == j){
                    ans = Math.min(ans,A[i] + B[j]);
                }else{
                    ans = Math.min(ans,Math.max(A[i],B[j]));
                }
            }
        }
        System.out.println(ans);
    }
}