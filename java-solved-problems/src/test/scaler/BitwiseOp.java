package test.scaler;

public class BitwiseOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte n=10;
		System.out.println(n);
		System.out.println(n<<1);
		System.out.println((byte)(n<<4));
		System.out.println(n>>1);
		
		int m=-1;
		System.out.println(m);
		System.out.println(Integer.toBinaryString((byte)m));
		System.out.println(m<<1);
		System.out.println(m>>1);
		System.out.println(m>>2);
		
		byte p=-16;
		System.out.println(p);
		System.out.println(Integer.toBinaryString((byte)p));
		System.out.println(new Integer(p<<1).byteValue());
		System.out.println((byte)p>>1);
		System.out.println((byte)p>>2);		
	}
}
