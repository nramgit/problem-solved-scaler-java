package test.string;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "bhbh";
		System.out.println("The possible vowel sequences are: "+maxVowels(str));
	}
	
	static String maxVowels(String str) {
		int count=0;
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char vowel = str.charAt(i);
			if(vowel == 'a' || vowel == 'e' ||vowel == 'i'||vowel == 'o'||vowel == 'u' ){
				count++;
				sb.append(vowel);
			}
		}
		//if(count==0)
			//return sb.toString();
		return sb.toString();		
	}

}
