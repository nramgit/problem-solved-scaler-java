package test.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagExtract {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		while(testCases>0){
			String line = in.nextLine();
			/*String startTag = line.substring(line.indexOf("<")+1,line.indexOf(">"));
            String endTag = line.substring(line.lastIndexOf("<")+2,line.lastIndexOf(">"));
            
            System.out.println(startTag+"/"+endTag);
            
            if(startTag.equals(endTag)) {
            	System.out.println(line.substring(startTag,startTag));
            }*/
			boolean matchFound = false;
			
			Pattern match = Pattern.compile("<(.+)>([^<]+)</\\1>");
			Matcher m = match.matcher(line);
		
			while(m.find()) {
				System.out.println(m.group(2));
				matchFound=true;
			}
			
			if(!matchFound) {
				System.out.println("None");				
			}
			testCases--;
		}
	}
}