import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        if(X % 100 == 0){
            System.out.println(100);
        }else{
            System.out.println(100 - (X % 100));
        }

    }
}