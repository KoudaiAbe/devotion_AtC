import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String C = sc.next();

        if(C.charAt(0) == C.charAt(1) && C.charAt(0) == C.charAt(2) && C.charAt(1) == C.charAt(2)){
            System.out.println("Won");
        }else{
            System.out.println("Lost");
        }

    }
}