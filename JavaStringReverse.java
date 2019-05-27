import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        int len = A.length();
	        int mid = len/2;
	        int i=0;
	        int j=len-1;
	        int count = 0;
	        while(j>i) {
	            if(A.charAt(i)==A.charAt(j)) {
	                count = count+1;
	            }
	            i++;
	            j--;
	        }
	            
	        if(count == mid) {
	            System.out.println("Yes");
	        }else {
	            System.out.println("No");
	        }
	        sc.close();
	       

	}

}
