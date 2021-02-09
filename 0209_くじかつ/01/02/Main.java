import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int X = sc.nextInt();
        
        int m[] = new int[N];
        for(int i = 0; i < N; i++){
            m[i] = sc.nextInt();
        }

        int sum_total = 0;
        for(int i = 0;i < m.length;i++){
            sum_total += m[i];
        }

        int min = m[0];
        for(int i = 0;i < m.length;i++){
            if(m[i] < min){
                min = m[i];
            }
        }

        System.out.println(N +((X - sum_total) / min));
    }
}