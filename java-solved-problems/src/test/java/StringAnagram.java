package test.java;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

    public static void main(String[] args) {
        
    	 String a = "test";
         String b = "test";
         System.out.println("The strings are anagram::"+isAnagram(a, b));
                  
    }
    static boolean isAnagram(String a,String b) {
    	
    	if(a.length() != b.length())
       	 	return false;
        
        char [] m = a.toLowerCase().toCharArray();
        char [] n = b.toLowerCase().toCharArray();
        
        Arrays.sort(m);
        Arrays.sort(n);
        
        return Arrays.equals(m, n);
    }
}

