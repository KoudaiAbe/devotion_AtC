import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        double x = Math.pow(a, 2);
        double y = Math.pow(a, 3);

        int z = (int) (a + x + y);

        System.out.println(z);
    }
}