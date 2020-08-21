import java.util.*;
public class Replace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the paragraph:");
        String para=sc.nextLine();
        System.out.println("Enter words you want to replace");
        String w = sc.nextLine();
        ArrayList<String>word=new ArrayList<String>();
        StringBuilder sb=new StringBuilder();
        int n=w.length();
        int i=0;
        while(i<n)
        {
            if(w.charAt(i)==' ')
            {
            String str=sb.toString();
            word.add(str);
            sb=new StringBuilder();
            }
            else
            sb.append(w.charAt(i));
            i++;
        }
        String str=sb.toString();
        word.add(str);
        StringBuilder changed;
        for(String j:word)
        {
            changed = new StringBuilder();
            changed.append(j.charAt(0));
            for(i=0; i<j.length()-1; ++i)
                changed.append('*');
            j="\\b"+j+"\\b";
            para=para.replaceAll(j, changed.toString());
        }
        System.out.println(para);
        sc.close();

	}

}
