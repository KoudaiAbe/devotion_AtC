import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int T = sc.nextInt();
        int S = sc.nextInt();
        int D = sc.nextInt();


        if(D < V * T || D > V * S){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}