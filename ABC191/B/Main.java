import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int S = sc.nextInt();
        int D = sc.nextInt();

        for(int i = 1; i <= N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x < S && y > D){
                System.out.println("Yes");
                break;
            }
            if(i == N){
                System.out.println("No");
                break;
            }
        }
    }
}