package test.java;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println((new StringBuilder(A).reverse()).toString().equals(A) ? "Yes" : "No");
        
        
        StringBuilder B = new StringBuilder();
        //for(int i=A.length()-1;i>=0;i--)
        //    B.append(A.charAt(i));
        
        //System.out.println(A+"/"+B+"/");
        			
       /* if(A.equals(B)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }*/
    }
}
