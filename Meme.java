import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    StringBuilder sb = new StringBuilder("CGPA uchi Rakhunga");
		System.out.println(sb);
		for(int i= sb.length(); i>0; i--){
		    sb.delete(i-1,i);
		    if (sb.length() > 0) { // Avoid printing empty StringBuilder
                System.out.println(sb);
		    }
		}
		StringBuilder bs = new StringBuilder("Chud gye guru!!!");
	    for (int i = 1; i <= bs.length(); i++) {
        System.out.println(bs.substring(0, i)); 
        }
	}
}
