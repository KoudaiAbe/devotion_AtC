import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        String n = T.substring(0,T.length()-1);

        if(S.equals(n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}