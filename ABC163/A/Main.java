import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double R = sc.nextInt();
        double p = 3.14;
        double c =  (p * R) *2;

        System.out.println(c);
    }
}