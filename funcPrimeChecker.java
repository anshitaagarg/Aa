import java.util.*;
public class Main{
    public static void PrimeChecker(int n){
        if(n<0){
            System.out.println("invalid input");
            return;
        }
        int flag = 0;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
               flag = 1;
               break;
            }
        }
        if(flag ==0){
            System.out.println(n + " is prime");
        }else{
             System.out.println(n + " is not prime");
        }return;
    }
	public static void main(String[] args) {
	    System.out.println("Enter a number to check prime or not: ");
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		  PrimeChecker(n);
	}
}
