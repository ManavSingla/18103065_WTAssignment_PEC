import java.util.*;

public class ShortestPath
{
    int patharray[];
    int v; 
    public ShortestPath(int v)
    {  
        this.v = v;
        patharray = new int[v + 1];
    }

    public void Find_shortest_path(int source, int adjacency_matrix[][])
    {
        for (int node = 1; node <= v; node++)
        {
            patharray[node] = Integer.MAX_VALUE;
        }
        patharray[source] = 0;
        for (int node = 1; node <= v - 1; node++)
        {
            for (int s= 1; s<= v; s++)
            {
                for (int d = 1; d<= v; d++)
                {         
                    if (adjacency_matrix[s][d] != Integer.MAX_VALUE)
                    {
                        if (patharray[d] > patharray[s] + adjacency_matrix[s][d])
                        	patharray[d] = patharray[s] + adjacency_matrix[s][d];
                    }
                }
            }
        }

        for (int s= 1; s <= v;s++)
        {
            for (int d = 1; d <= v; d++)
            {
                if (adjacency_matrix[s][d] != Integer.MAX_VALUE)
                {
                    if (patharray[d] > patharray[s] + adjacency_matrix[s][d])
                        System.out.println("The Graph contains negative edge cycle");
                }
            }
        }
 
        for (int x = 1; x <= v; x++)
        {
            System.out.println("distance of source  " + source + " to "+ x + " is " + patharray[x]);
        }
    }
 
    public static void main(String[] arg)
    {
        int v = 0;   
        int source;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        v=sc.nextInt();
		sc.nextLine();
       
        int adjacency_matrix[][] = new int[v + 1][v + 1];   
    
        for (int s = 1; s<=v; s++)
        {
            for (int d = 1; d <= v; d++)
            {
            	System.out.println("Enter weight of edge from "+ s +" to "+ d );
                System.out.println("ENTER 0 if edge does not exist!");
                adjacency_matrix[s][d] = sc.nextInt();
 	
            	if (s == d)
                {
                    adjacency_matrix[s][d] = 0;
                    continue;
            	}
    
            	else if (adjacency_matrix[s][d] == 0)
                {
                    adjacency_matrix[s][d] = Integer.MAX_VALUE;                 
            	}
            }
        }
 
        System.out.println("Enter the source vertex: ");
        source = sc.nextInt();
 
        ShortestPath object1 = new ShortestPath(v);
        object1.Find_shortest_path(source, adjacency_matrix);
        sc.close();	
    }
}
