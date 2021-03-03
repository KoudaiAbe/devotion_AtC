import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        
        if("SSS".equals(S)){
            System.out.println("0");
        }
        else if("SRR".equals(S) || "RRS".equals(S)){
            System.out.println("2");
        }else if("SSS".equals(S)){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
}