package string;

public class demo7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {23,45,56,78};
		int min = arr[0];
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("min: " + min);
	}
}
