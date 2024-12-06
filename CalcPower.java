/****Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.****/
import java.util.*;
public class Main{
    public static void Power(int x, int n){
        int result = 1;
        for(int i = 0; i < n; i++){
            // result = result*x;
            result*= x;
        }
        System.out.println("x to the power n is x^n = " + result);
    }
	public static void main(String[] args) {
		System.out.print("Enter the base number: ");
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		System.out.print("Enter the exponent number: ");
		int exponent = sc.nextInt();
		Power(base, exponent);
	}
}
