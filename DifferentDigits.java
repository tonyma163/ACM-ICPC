//Ma Man To Tony 2022/8/11
//Different Digits 6134
import java.util.*;

public class DifferentDigits {
	
	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		while(s.hasNextInt()) {
			
			int n = s.nextInt();
			int m = s.nextInt();
			
			int count = 0;
			
			for (int i=n; i<=m; i++) {
				
				boolean flag = false;
				
				//change the int to string and check the digit has repeated or not
				String temp = String.valueOf(i);
				for (int x=0; x<temp.length(); x++)
					for (int y=x+1; y<temp.length(); y++) {
						if(temp.charAt(x)==temp.charAt(y)) {
							flag = true;
						}
					}
				
				//isNotRepeated
				if (!flag) count++; //update counter
			}
			
			System.out.println(count);
		}
		
	}
}
