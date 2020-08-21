import java.util.Scanner;
public class Anagrams {
	
	public boolean areAnagrams(String x, String y) {
		int character[] = new int[256];
		if(x.length() != y.length())
			return false;
		for(int i=0;i<x.length();i++)
			character[x.charAt(i)]++;
		for(int i=0;i<y.length();i++)
			character[y.charAt(i)]--;
		for(int i=0;i<256;i++)
			if(character[i]!=0)
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number/strings(lowercase alphabets only): ");
		String x = sc.nextLine();
		String y = sc.nextLine();
		if(new Anagrams().areAnagrams(x,y)){
			System.out.println("Anagrams!");
		}
		else {
			System.out.println("Not Anagrams!");
		}
		sc.close();
	}

}
