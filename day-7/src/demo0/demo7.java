package demo0;

class CheppanuException extends Exception{
	public CheppanuException(String message) {
		super(message);
		
	}
}

public class demo7 {
	public static void  agecheck(int age) throws CheppanuException {
		if(age<40) {
			throw new CheppanuException("nenu cheppanu");
		}else {
			System.out.println("na age below 18");
		}
	}
	public static void main(String[] args) {
		try {
			agecheck(20);
		}catch(CheppanuException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("happy coding");
		}
	}
}
