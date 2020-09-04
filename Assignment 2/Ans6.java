import java.util.*;

public class Ans6{

    public static void main (String arg[])
    {

	    Scanner sc = new Scanner(System.in);
	
	        System.out.println("Enter a number ");
	        int num = sc.nextInt();
	
	        System.out.println("Hailstone sequence of " + num + " is: ");
	        int c = 0;
	
	        while(num!=1 && c<Integer.MAX_VALUE && num<Integer.MAX_VALUE && num>0)
	        {
	
	            if(num%2!=0)
	            {
	                num*=3;
	                num++;
	            }
	            else
	            {
	                num/=2;
	            }
	
	            System.out.print(num + " ");
	            c++;
	        }
	        System.out.println();
	
	        if (num==1)
	            System.out.println("No of steps required "+c);
	
	        else if (num==Integer.MAX_VALUE || num<0)
	            System.out.println("Integer overflow reached");
	        
	        else
	            System.out.println("No of steps maxed out.");
	        sc.close();
	    }
}