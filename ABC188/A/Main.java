import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int Z = Math.abs(X-Y);

        System.out.println(Z);

        if(Z < 3){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}