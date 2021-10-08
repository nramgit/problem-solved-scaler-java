package test.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPExtract{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		while(testCases>0){
			String line = in.nextLine();
			
			boolean matchFound = false;
			
			Pattern match = Pattern.compile("\\d\\d\\d.\\d\\d\\d");
			Matcher m = match.matcher(line);
		
			while(m.find()) {
				System.out.println(m.group(0));
				matchFound=true;
			}
			
			if(!matchFound) {
				System.out.println("None");				
			}
			testCases--;
		}
	}
}