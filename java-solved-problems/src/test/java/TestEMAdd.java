package test.java;

public class TestEMAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=30;
		int i=0,j=0,n=0;
		while(i<value && j<value && (i+j)<n) {
			//System.out.println(" values:"+(String.valueOf(i)+String.valueOf(j)));
			//if((value-n)==(i+j) && n+(i+j)==value && (String.valueOf(i)+String.valueOf(j)).equals(n)) {
			if((value-n)==(i+j) && n+(i+j)==value) {
				System.out.println(" Matched "+n+"/"+i+"/"+j+"/"+value);						
			}
		i++;
		j++;
		n++;
		}
	}

}
