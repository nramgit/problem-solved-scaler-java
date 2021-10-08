package test.scaler;

public class TimeComplexityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int k=0,n=10;
		
		for(int i=n/2;i<=n;i++) {
			for(int j=2;j<=n;j=j*2) {
				k=k+n/2;
				System.out.println("loop:"+i+" "+j+" "+k);
			}
		}
		*/
		/*int a=0,c=0;
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				a=a+i+j;
				c++;
				System.out.println("loop:"+i+" "+j+" "+a);
			}
		}
		System.out.println("cout:"+c);*/
		
		int n=10,m=10;
		
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				System.out.println("outer loop:"+i+" "+j);	
				for(int k=j;k<k;k++) {
					System.out.println("inner loop:"+i+" "+j+" "+k);	
				}
			}
		}
		
		int i=1;
		while(i<n) {
			int x=i;			
			//while(x--) {
				System.out.println(i+" "+x);
			//}
			i++;
		}
	}

}
