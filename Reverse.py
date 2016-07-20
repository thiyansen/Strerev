import java.util.Scanner;
public class Palindrome {
private static Scanner in;

	public static void main(String[] args) {
		String input1= new String();
		in = new Scanner(System.in);
		input1 = in.next();
		boolean output1;
		StringBuffer s = new StringBuffer(input1);
		s.reverse();
        input1 = new String(s); 
		System.out.println(input1);		
	}
}
		
	
