import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int milk_solid = A + B;
        
        if(15 <= milk_solid && 8 <= B){
            System.out.println(1);
        }else if(10 <= milk_solid && 3 <= B){
            System.out.println(2);
        }else if(3 <= milk_solid){
            System.out.println(3);
        }else{
            System.out.println(4);
        } 
    }
}