import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double D = sc.nextInt();
        int T = sc.nextInt();
        double S = sc.nextInt();

        if(D/S <= T){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}