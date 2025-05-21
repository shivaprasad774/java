package javaday1;
public class demo7 {

	public static void main(String[] args) {
		String a[]= {"shiva","sai","harsha"};
		for(String x:a){
		System.out.println(x);
	}
	int n=20;
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) {
			System.out.println(i);
		}
	}
}

}
