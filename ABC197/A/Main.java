import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String First = S.substring(0,1);

        System.out.println(S.substring(1,3) + First);
    }
}
