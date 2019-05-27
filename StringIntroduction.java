import java.util.*;
public class StringIntroduction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        //For the first line, sum the lengths of  and A and B
        int sum = A.length() + B.length();
        System.out.println(sum);
      
        
        //second line, write Yes if A is lexicographically greater than B otherwise print No instead.
        if(A.compareTo(B)>=1){
            System.out.println("Yes");

        }else{
            System.out.println("No");
        }
        
        //third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
        String subUA = A.substring(0,1);
        subUA = subUA.toUpperCase();
        String subLA = A.substring(1,A.length());
        A = subUA + subLA;
        String subUB = B.substring(0,1);
        subUB = subUB.toUpperCase();
        String subLB = B.substring(1,B.length());
        B = subUB + subLB;
        System.out.println(A + " " +B);
        sc.close();
	}
		// TODO Auto-generated method stub
		



}
