import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int H = sc.nextInt();

        if(H % M == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}