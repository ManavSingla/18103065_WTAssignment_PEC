import java.util.*;

public class Ans3 {
	
	public static void Sort(char[] arr)
	{
		int n= arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					char temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		Sort(arr);
		str = new String(arr);
		System.out.println("Sorted String: "+ str);
		sc.close();
	}
}
