import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String S = sc.next();
        String ans;

        if(K < S.length()){
            ans = S.substring(0,K);
            System.out.println(ans + "...");
        }else{
            System.out.println(S);
        }
    }
}