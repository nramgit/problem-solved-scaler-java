package test.generics;

public class Emp<T> {
	private T id;
	
	Emp(T id){
		this.id = id;
	}
	
	public T getId() {
		return id;
	}
	public void setId(T id) {
		this.id = id;
	}	
}
