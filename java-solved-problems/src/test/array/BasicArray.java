package test.array;

public class BasicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int[] arr = new int[10];
		System.out.println("Array Elements:");
		arr[1]=10;
		arr[9]=90;
		int sum=0;
		System.out.println(arr[9]+"/"+arr[3]);
		for(int i:arr) {
			sum+=i;
			System.out.println(i+"/"+sum);
		}
		arr[9]=9;*/
		
		//System.out.println("Modulo op:"+(2000%100));
		
		int ans = fun(100,2000);
		
		System.out.println(ans);
		System.out.println(fib(6));
		
		for(int i=1;i<6;i++)
			System.out.println(fibT(i)+" ");
			
		
	}
	static int fun(int A,int B){
		if(B==0)
			return A;
		else	
			return fun(B,A%B);
	}
	
	static int fib(int n){
		if(n<=1)
			return n;
		else
			return fib(n-1)+fib(n-2);
	}
	static int fibT(int n){
		if(n==0 || n==1 || n==2)
			return 0;
		if(n==3)
			return 1;
		else
			return fibT(n-1)+fibT(n-2)+fibT(n-3);
			
	}

}
