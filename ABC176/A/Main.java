import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();

        int time = (N + X - 1) / X;
        int ans = time * T;
        System.out.println(ans);
    }
}