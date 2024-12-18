/****Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.*****/
import java.util.*;
public class Main{
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int numbers[] = new int[5];
       System.out.println("Enter 5 numbers to insert in array: ");
       for(int i=0; i<5; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for(int i=0; i<numbers.length-1; i++) {    // NOTICE numbers.length - 1 as termination condition
           if(numbers[i] > numbers[i+1]) {        // This is the condition for descending order
               isAscending = false;
            }
        }
       if(isAscending) {
           System.out.println("The array is sorted in ascending order");
        }else{
           System.out.println("The array is not sorted in ascending order");
        }
    }
}
