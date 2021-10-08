package test.generics;
import java.util.*;;

public class TestGenericsCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();
		list.add("test");
		list.add("10");
		
		for (String obj : list) {
			System.out.println("List elements:"+obj);
		}
		
		Emp<Integer> e =  new Emp<>(10);
		
		System.out.println(" value::"+e.getId());
		
		Emp<String> e1 =  new Emp<>("123A");
		
		System.out.println(" value::"+e1.getId());
		
		HashMap<Integer,String> map = new HashMap<>();
		
		Bin<Integer,String> b = new Bin<>();
		
		b.setKey(100);
		b.setValue("Ramesh");
		System.out.println(" Here are :"+b.getKey()+"/"+b.getValue());
	}

}
