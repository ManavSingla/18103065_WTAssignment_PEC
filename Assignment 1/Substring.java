import java.util.*;

public class Substring {
    public int count(String str1,String str2){
        if(str2.length()==0 || str1.length()==0){
            return 0;
        }
        int counter = 0;
        int arr[] = new int[256];
        for(int i=0;i<str1.length();i++){
            arr[str1.charAt(i)]++;
        }
        boolean flag=true;
        while(flag){
            for(int i=0;i<str2.length();i++){
                if(arr[str2.charAt(i)]==0){
                    flag = false;
                    break;
                }
                arr[str2.charAt(i)]--;
            }
            counter++;
        }
        return counter-1;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the strings and its substring: ");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        System.out.println("Count: "+new Substring().count(str1,str2));
    }
}