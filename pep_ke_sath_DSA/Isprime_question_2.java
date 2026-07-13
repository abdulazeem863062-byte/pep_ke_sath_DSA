
import java.util.Scanner;

class Isprime_question_2{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scr.nextInt();
        int i;
        for( i=2; i<n; i++){
            if(n%i==0){
                System.err.println("Not a Prime number");
                break;
            }
        }
        
        if(i == n){
            System.err.println("Prime number");
        }
    }
}