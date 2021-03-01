import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int cash = -1;

        for(int i = 0; i < N; i++){
            int A = sc.nextInt();
            int P = sc.nextInt();
            int X = sc.nextInt();

            if(X > A){
                if(cash == -1 || cash > P){
                    cash = P;
                }
            }
        }
        System.out.println(cash);
    }
}