package forLoop;

import java.util.Arrays;

public class Anagaram {
	public void getAnagram(String a,String b) {
		char[] c=a.toCharArray();
		char[] d=b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		if(Arrays.equals(c, d)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("is not anagram");
		}
			
		
	}
}
