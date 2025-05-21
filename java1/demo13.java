package string;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str1 ="listen";
		String Str2 ="slient";
		StringBuffer sb1=new StringBuffer(Str1);
		StringBuffer sb2=new StringBuffer(Str2);
		System.out.println(sb1.append(sb2));

	}

}


