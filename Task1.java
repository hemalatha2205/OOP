package tasks;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte  a = 5;
		short  s = 100;
		int  n = 5000;
		long  l = 10000;
		float  f = 5.5f;
		double  d = 10.5;
		char  c = 'a';
		boolean b= true;
		System.out.println("byte a:"+a+" size =" + Byte.BYTES + "Bytes");
		System.out.println("short s:"+s+" size =" + Short.BYTES+ "Bytes");
		System.out.println("int n:"+n+" size =" + Integer.BYTES+ "Bytes");
		System.out.println("long l:"+l+ " size =" + Long.BYTES+ "Bytes");
		System.out.println("float f:"+f+ " size =" + Float.BYTES+ "Bytes");
		System.out.println("double d:"+d+ " size =" + Double.BYTES+ "Bytes");
		System.out.println("char c:"+c+ " size =" + Character.BYTES+ "Bytes");
		System.out.println("boolean b:"+b+" size depends on JVM usually 1 or more");
	}
}
