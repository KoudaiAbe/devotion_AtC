import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.nextLine();
        int result = X.indexOf(".");

        if(result >= 0){
            String ans = X.substring(0, result);
            System.out.println(ans);
        }else{
            System.out.println(X);
        }
    }
}
