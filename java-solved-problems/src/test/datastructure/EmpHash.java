package test.datastructure;

public class EmpHash {
	
	private String key;
	private Emp emp;
	
	public EmpHash(String key, Emp emp) {
		super();
		this.key = key;
		this.emp = emp;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

}
