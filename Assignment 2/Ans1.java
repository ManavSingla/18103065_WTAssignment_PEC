import java.util.*;

public class Ans1 {
	
	public static int CompareStrings(String s1, String s2)
	{
		for(int i=0;i<s1.length() && i<s2.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
				continue;
			else
				return (int)s1.charAt(i) - (int)s2.charAt(i);
		}
		if(s1.length() == s2.length())
			return 0;
		else
			return s1.length() - s2.length();
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		System.out.println("Enter two Strings that you want to compare: ");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		int check = CompareStrings(s1, s2);
		if(check<0)
		{
			System.out.println("Smaller String is: "+ s1);
			System.out.println("Larger String is: "+ s2);
		}
		else if(check>0)
		{
			System.out.println("Smaller String is: "+ s2);
			System.out.println("Larger String is: "+ s1);
		}
		else
			System.out.println("Strings are Equal or Same!");
		sc.close();
		
	}
}
