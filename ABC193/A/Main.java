import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextInt();
        double B = sc.nextInt();

        double ans = ((1 - B / A) * 100);

        System.out.println(ans);
    }
}