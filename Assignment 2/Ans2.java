import java.util.*;

public class Ans2 {
	
	public static void CountSort(int[] arr)
	{
		int n = arr.length;
		int[] freq = new int[21];
		for (int i=0; i<21; i++) 
            freq[i] = 0; 
		for(int i=0;i<n;i++)
		{
			freq[arr[i]]++;
		}
		int pointer = 0;
		for(int i=0;i<21;i++)
		{
			for(int j=0;j<freq[i];j++)
			{
				arr[pointer]=i;
				pointer++;
			}
		} 
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements (in range 0-20)");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			if(arr[i]<0 || arr[i]>20)
				arr[i]=0;
		}
		CountSort(arr);
		System.out.println("Sorted Array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		sc.close();
	}
}
