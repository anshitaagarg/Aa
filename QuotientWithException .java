import java.util.*;
//ExceptionHandling
 public class QuotientWithException {
 public static double quotient(double number1, double number2) {
 // if (number2 == 0)
 // throw new ArithmeticException("Divisor cannot be zero");
 return number1 / number2;
 }
   
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 // Prompt the user to enter two integers
 System.out.print("Enter two integers: ");
 double number1 = input.nextDouble();
 double number2 = input.nextDouble();
 //try and catch block
 try {
 double result = quotient(number1, number2);
 System.out.println(number1 + " / " + number2 + " is " + result);
 }
 catch (ArithmeticException ex) {
 System.out.println("Exception: an integer cannot be divided by zero ");
 }
 System.out.println("Execution continues ...");
 }
 }
