package demo0;

class EvenOddException extends Exception{
	public EvenOddException(String message) {
		super(message);
		
	}
}

public class demo8 {
	public static void  evenoddcheck(int evenodd) throws EvenOddException {
		if(evenodd % 2==0) {
			throw new EvenOddException("naku maths vachu");
		}else {
			System.out.println("naku maths radhu");
		}
	}
	public static void main(String[] args) {
		try {
			evenoddcheck(20);
			}catch(EvenOddException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("nv maths neruchuko");
		}
	}
}
