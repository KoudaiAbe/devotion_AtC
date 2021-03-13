import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int W = sc.nextInt();

        int mikanMin = 0;
        int mikanMax = 0;

        for(int i = 0;i <= 1000000;i++){
            if(A * i <= 1000 * W && 1000 * W <= B *i){
                if(mikanMax == 0){
                    mikanMax = i;
                }
                if(mikanMin == 0){
                    mikanMin = i; 
                }
                mikanMax = Math.max(i,mikanMax);
                mikanMin = Math.min(i,mikanMin);
            }
        }

        if(mikanMax == 0){
            System.out.println("UNSATISFIABLE");
        }else{
            System.out.println(mikanMin + " " + mikanMax);
        }
    }
}