//Ma Man To Tony 2022/8/11
//Easier Done Than Said 2062
import java.util.*;

public class EasierDoneThanSaid {
	
	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		while(s.hasNext()) {
			String tempString = s.next();
			
			boolean flag = false;
			
			//requirements
			//1. must contain at least one vowel a e i o u
			for (int i=0; i<tempString.length(); i++) {
				if (isVowel(tempString.charAt(i))) { flag = true; break; }
			}
			
			if (flag) {
			//2. cannot has three consecutive vowels or three consecutive consonants
				for (int i=0; i<tempString.length(); i++) {
					if (isVowel(tempString.charAt(i))) {//the first is vowel
						if (i+1<tempString.length() && isVowel(tempString.charAt(i+1))) {//the second is vowel
							if (i+2<tempString.length() && isVowel(tempString.charAt(i+2))) { flag = false; break; }// the third is vowel
						}
					} else {//the first is not vowel
						if (i+2<tempString.length() && !isVowel(tempString.charAt(i+1))) {//the second is not vowel
							if (!isVowel(tempString.charAt(i+2))) { flag = false; break; } // the third is not vowel
						}
					}
				}
				
				//3. cannot contain two  consecutive occurrences of the same letter, except for ．ee・ or ．oo・.
				if (flag) {
					for (int i=0; i<tempString.length(); i++) {
						if (i+1<tempString.length() && tempString.charAt(i)==tempString.charAt(i+1)) {
					
							//except for 'ee' or 'oo'
							if (tempString.charAt(i)!='e' && tempString.charAt(i)!='o') {
								flag = false; break;
							}
						
						}
					}
				}
			}
			
			//print result according to the flag result
			if (flag)
				System.out.println("<"+tempString+"> is acceptable.");
			else
				System.out.println("<"+tempString+"> is not acceptable.");
		}
	}
	
	public static boolean isVowel(char c) {
		boolean result = false;
		if (c=='a') result = true;
		if (c=='e') result = true;
		if (c=='i') result = true;
		if (c=='o') result = true;
		if (c=='u') result = true;
		return result;
	}

}
