import java.util.Scanner;
public class Anagrams {
	
	public boolean areAnagrams(String str, String substr) {
		int character[] = new int[256];
		if(str.length() != substr.length())
			return false;
		for(int i=0;i<str.length();i++)
			character[str.charAt(i)]++;
		for(int i=0;i<substr.length();i++)
			character[substr.charAt(i)]--;
		for(int i=0;i<256;i++)
			if(character[i]!=0)
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number/strings(lowercase alphabets only): ");
		String str = sc.nextLine();
		String substr = sc.nextLine();
		if(new Anagrams().areAnagrams(str,substr)){
			System.out.println("Anagrams!");
		}
		else {
			System.out.println("Not Anagrams!");
		}
		sc.close();
	}

}
