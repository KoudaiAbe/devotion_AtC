import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Takahashi_A = sc.nextInt();
        int Aoki_B = sc.nextInt();
        int C = sc.nextInt();

        if(C == 0){
            if(Aoki_B < Takahashi_A){
                System.out.println("Takahashi");
            }else{
                System.out.println("Aoki");
            }
        }else{
            if(Aoki_B > Takahashi_A){
                System.out.println("Aoki");
            }else{
                System.out.println("Takahashi");
            }
        }
    }
}