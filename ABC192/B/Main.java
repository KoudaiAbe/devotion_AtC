import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String ans = "Yes";

        for(int i = 0; i < S.length(); i++)
        {
            if(i % 2 == 0)
            {
                if(Character.isUpperCase(S.charAt(i)))
                {
                    ans = "No";
                    break;    
                }
            }
            else
            {
                if(Character.isLowerCase(S.charAt(i)))
                {
                    ans = "No";
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}