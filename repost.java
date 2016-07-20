import java.util.Scanner;

public class stringss {
	
	public static void main(String[] args) {
			String input1;
			
			String output1="";
			Scanner in = new Scanner(System.in);
			input1= in.nextLine();
			
			String[] str = new String[20];
			String[] str2 = new String[20];
			int i, j = 0, k = 0;
			char c;
			for (i = 0; i < input1.length(); i++) {
				c = input1.charAt(i);
				if (c == ' ') {
					str[j] = input1.substring(k, i);
					j++;
					k = i + 1;
				}
				if (i == (input1.length() - 1)) {
					str[j] = input1.substring(k, i + 1);
				}

			}
			StringBuffer[] sb = new StringBuffer[20];
			StringBuffer sb2 = new StringBuffer();

				for (i = 0; i <= j; i++) {

				
					sb[i] = new StringBuffer(str[i]);
					sb[i].reverse();
					sb2 = sb2.append(sb[i]);
					if(i<j)
					{ sb2 = sb2.append(" ");
				}
				output1 = sb2.toString();
				}
				System.out.println(output1);
}
	}
