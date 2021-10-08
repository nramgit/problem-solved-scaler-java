package hack.challenge;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c1 = {'t','e','s'};
		char[] c2 = {'s','e','s'};

		boolean isAnagram = anagram(c1,c2);
		if(isAnagram)
			System.out.println("The given string is anagram");
		else
			System.out.println("The given string is not anagram");
	}
	static boolean anagram(char[] c1,char[] c2) {
		
		if(c1.length!=c2.length)
			return false;
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.print("Char array:"+c1[0]+"/"+c2[0]);
		
		for (int i=0;i<c1.length;i++)
			if(c1[i]!=c2[i])
				return false;
		
		return true;
	}

}
