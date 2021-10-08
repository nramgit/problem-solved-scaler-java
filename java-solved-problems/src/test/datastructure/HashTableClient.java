package test.datastructure;

public class HashTableClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleHashTable hashtable =  new SimpleHashTable(10);
		
		//System.out.println("Test: "+(8%3));
		Emp e2=new Emp(200,"suresh");
		
		hashtable.put("100", new Emp(100,"Ramesh"));
		hashtable.put("200", e2);
		hashtable.put("300", new Emp(300,"kumar"));
		hashtable.printHashtable();
		System.out.println("Retrieve item: "+hashtable.get("200").getEmp());
	}

}
