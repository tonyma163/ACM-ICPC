//Ma Man To Tony 2022/8/11
//Voting Fraud 8012
import java.util.*;

public class VotingFraud {

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		
		for (int i=0; i<t; i++) {
			
			int n = s.nextInt();
			int[] a = new int[n];
			
			int count = 0;

			for (int j=0; j<n; j++) {
				
				int tempId = s.nextInt();
				
				//whether the id is existing in the array
				boolean flag = false;
				for (int x=0; x<n; x++) {
					if (a[x]==tempId) flag = true;
				}
				
				//isExisted
				if (flag==true)
					count++;
				
				a[j]=tempId; //save
				
			}
			
			System.out.println(count);
			
		}
	}
	
}
