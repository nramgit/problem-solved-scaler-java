package test.java;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class ArrayTest {

	public static void main(String []argh){
		
		String s1="hello";
		String s2="test";
		String largest=null,smallest=null;
		//s1 = s1.substring(0,1).toUpperCase()+s1.substring(1, s1.length());
		//System.out.println("String= "+s1);
		
		//System.out.println("String lexi comparision :"+(s1.compareTo(s2)>0));
		//System.out.println("String lexi comparision :"+s2.compareTo(s1));
		
		ArrayList<String> list = new ArrayList<>();
		int i=0,x=3;
		while(i<x && x<= s1.length()) {
			list.add(s1.substring(i, x));
			i++;x++;
		}
		int k=1;
		 for(int j=0;j<list.size();j++){
			 if(list.get(j).compareTo(list.get(k))>0) {
					largest=list.get(j);				
				}
				else {
					smallest=list.get(k);
				}
		 }
	     System.out.println("Str=="+list+"/"+largest+"/"+smallest);
		 
		/*
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int[] s = new int[n];
            int p=0;*/
            /*for (int j=0;j<n;j++){
            	p=p+(power(2,j)*b);
                s[j] = (a+p);
            } */  
         /*   for (int j=0;j<n;j++){
            	p=p+(int)(Math.pow(2,j)*b);
                s[j] = a+p;
            }
            for(int k:s)
            	System.out.print(k+" ");            
        }
        in.close();*/
    }
	static int power(int n,int p) {
		int power=1;
		for(int i=0;i<p;i++)
			power=power*n;
		return power;
	}
	
} 
