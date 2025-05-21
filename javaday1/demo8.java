package javaday1;
public class demo8 {

	public static void main(String[] args) {
		int a1=Integer.parseInt(args[0]);
		double d1=Double.parseDouble(args[1]);	
		String a=args[2];
		char ch = args[3].charAt(0);
		System.out.println(a1);
		System.out.println(d1);
		System.out.println(a);
		System.out.println(ch);
		short s=Short.parseShort(args[4]);
		long l=Long.parseLong(args[5]);
		float f=Float.parseFloat(args[5]);
		boolean b=Boolean.parseBoolean(args[6]);
		System.out.println(s);
		System.out.println(l);
		System.out.println(f);
		System.out.println(b);
	}
}
