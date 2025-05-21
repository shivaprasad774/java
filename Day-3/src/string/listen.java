package string;

public class listen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str1 ="listen";
		String Str2 ="silent";
		if (Str1.length()!=Str2.length()) {
			System.out.println("Not Anagrams");
			return;
			
		}
		int[] count=new int[26];
		for(int i=0;i<Str1.length();i++) {
			count[Str1.charAt(i)-'a']++;
			count[Str1.charAt(i)-'a']--;
			
			
		}
		boolean isAnagram = true;
		for(int i=0;i<26;i++) {
			if(count[i]!=0) {
				isAnagram=false;
				break;
			}
		}
		if(isAnagram)
			System.out.println("Anagram");
		else
			System.out.println();

	}

}
