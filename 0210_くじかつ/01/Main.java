import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A[] = new int[4];
        for(int i = 0; i < 4; i++){
            A[i] = sc.nextInt();
        }

        int min = A[0];
        for(int i = 0;i < A.length;i++){
            if(A[i] < min){
                min = A[i];
            }
        }
        System.out.println(min);
    }
}