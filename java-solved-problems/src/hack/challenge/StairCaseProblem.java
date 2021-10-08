package hack.challenge;

public class StairCaseProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println("The possible ways:"+fib(n));
	}
	
	static int fib(int n){
		
		if(n==0 || n==1)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}

}
