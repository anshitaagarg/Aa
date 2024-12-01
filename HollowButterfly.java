public class HollowButterfly{
	public static void main(String[] args) {
	    int n = 5;
	   // upper half
	    for(int i = 1; i <= n; i ++){
	       // 1st half stars
	        for(int j = 1; j <= i; j ++){
	            if(j == 1 ||j == i){
	                System.out.print("* ");
	            } else {
	                System.out.print("  ");
	            }
	        }
	       // spaces
	       for(int j = 1; j <= 2*(n-i); j ++){
	           System.out.print("  ");
	       }
	       // 2nd half stars
	       for(int j = 1; j <= i; j ++){
	           if(i == 1 || j == 1 || i == j || j == n){
	              System.out.print("* ");
	           } else {
	                System.out.print("  ");
	           }
	       }
		  System.out.println();
	    }
	   // lower half
	    for(int i = n; i >= 1; i --){
	       // 1st half stars
	        for(int j = 1; j <= i; j ++){
	            if(j == 1 ||j == i){
	                System.out.print("* ");
	            } else {
	                System.out.print("  ");
	            }
	        }
	       // spaces
	       for(int j = 1; j <= 2*(n-i); j ++){
	           System.out.print("  ");
	       }
	       // 2nd half stars
	       for(int j = 1; j <= i; j ++){
	           //System.out.print("* ");
	           if(j == i|| j == 1){
	              System.out.print("* ");
	           } else {
	                System.out.print("  ");
	           }
	       }
		  System.out.println();
	    }
	}
}
