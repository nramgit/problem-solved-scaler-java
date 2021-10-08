package test.array;

public class ModArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,44,3};
		/*System.out.println("Array Elements:");
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
		int j=1;
		int l=arr.length-1;
		int max=0;
		for(int i=0;i<arr.length-1 && j<arr.length ;i++) {
			System.out.println("index values1:"+arr[i]+"/"+arr[j]+"/"+i+"/"+j);
			int mod1 = arr[i]%arr[j];
			if(mod1>max)
				max=mod1;
			j++;
		}
		for(int k=arr.length-1;k<arr.length && l<arr.length-1 ;k--) {
			System.out.println("index values2:"+arr[k]+"/"+arr[l]+"/"+k+"/"+k);
			int mod2 = arr[k]%arr[l];
			if(mod2>max)
				max=mod2;
			l--;
		}
		System.out.println("The max mod from this array:"+max);
			
	}	

}
