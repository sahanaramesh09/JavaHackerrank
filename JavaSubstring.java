import java.util.Scanner;

public class JavaSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        String S = in.next();
	        int start = in.nextInt();
	        int end = in.nextInt();
	        String sub = S.substring(start,end);
	        System.out.println(sub);
	        in.close();
	}

}
