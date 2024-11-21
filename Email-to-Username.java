/***
Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123”
***/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Enter your E-mail Address: ");
		Scanner sc =  new Scanner(System.in);
		String email = sc.next();
		String Username = email.substring(0, email.length()-10);
		System.out.println("Username: " + Username);
	}
}
// alternate 

import java.util.*;
public class Main {
   public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     System.out.print("E-mail Address: ");
     String email = sc.next();
     String userName = "";
     for(int i=0; i<email.length(); i++) {
       if(email.charAt(i) == '@') {
        break;
       } else {
         userName += email.charAt(i);
       }
     }
     System.out.println("Username: "+ userName);
   }
}
