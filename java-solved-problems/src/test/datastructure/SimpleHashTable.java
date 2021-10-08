package test.datastructure;

public class SimpleHashTable {
	
	private EmpHash[] hashtable;
	
	public SimpleHashTable(int capacity) {
		hashtable = new EmpHash[capacity];		
	}
	
	public void put(String key, Emp emp) {
		
		int hashKey = getHashKey(key);
		
		if(occupaid(hashKey)) {
			int stopKey = hashKey;
			
			if(hashKey==hashtable.length-1)
				hashKey=0;
			else
				hashKey++;
					
			while(occupaid(hashKey) && hashKey!=stopKey) {
				hashKey = (hashKey+1) % hashtable.length;
			}
		}
		
		if(occupaid(hashKey)) {			
			System.out.println("There is already item available at this position "+hashKey);		
		}		
		else
			hashtable[hashKey] = new EmpHash(key, emp);		
	}
	
	public EmpHash get(String key) {
		
		
		
		int hashKey = findKey(key);
		if(hashKey==-1)
			return null;
		else
			hashtable[hashKey].getEmp();
				
		
		/*
		 * if(hashtable[hashKey]==null) {
		 * 
		 * System.out.println("There is no item available at this position"+hashKey);
		 * 
		 * } else { while(occupaid(hashKey) && hashtable[hashKey].getKey().equals(key))
		 * { return hashtable[hashKey]; } }
		 */
		return hashtable[hashKey];
	}
	
	private int findKey(String key) {
		
		int hashKey = getHashKey(key);	
		
		if(occupaid(hashKey) && hashtable[hashKey].getKey().equals(key)) {
			return hashKey;
		}		
		
		int stopKey = hashKey;
		
		if(hashKey==hashtable.length-1)
			hashKey=0;
		else
			hashKey++;
				
		while(occupaid(hashKey) && hashKey!=stopKey && !hashtable[hashKey].getKey().equals(key)) {
			hashKey = (hashKey+1) % hashtable.length;
		}	
		if(stopKey==hashKey)
			return -1;
		return hashKey;
	}
	
	private int getHashKey(String key) {
		return key.length() % hashtable.length;
	}
	
	private boolean occupaid(int key) {		
		return hashtable[key]!=null;
	}
	
	public void printHashtable() {
		//System.out.println("Lengh==>"+hashtable.length);
		for (int i=0;i<hashtable.length;i++) {
			if(hashtable[i]==null) 
				System.out.println("Empty");
			else
				System.out.println(hashtable[i].getEmp());
		}	
	}
}
