package demo0;
import java.util.*;

public class demo5 {
	public static void main(String[] main) {
		int[] arr1= {23,35,57,78,22};
		Arrays.sort(arr1);
		int a=Arrays.binarySearch(arr1,78);
		System.out.println(a);
		for(int b1:arr1)
		System.out.println(b1);
		System.out.println();
		
	}

}
