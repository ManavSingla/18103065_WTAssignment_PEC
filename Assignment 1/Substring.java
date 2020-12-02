import java.util.Scanner;

public class Substring {
    
    private boolean isCountZero(int[] chars){
        for(int i: chars)
            if(i != 0)
                return false;
        
        return true;
    }
    
    public int substring(String str, String subStr){
        if(str == null || str.length() < 1 || subStr == null || subStr.length() < 1)
            return 0;
        
        if(str.length() < subStr.length())
            return 0;
        
        int[] hash_array = new int[26];
        int winSize = subStr.length(), count = 0;
   
        for(char c: subStr.toCharArray())
            hash_array[c - 'a']++;
        for(char c: str.substring(0, winSize).toCharArray())
            hash_array[c - 'a']--;
        
        count += (isCountZero(hash_array))? 1: 0;
        
        for(int i=winSize; i<str.length(); ++i){
            
            hash_array[str.charAt(i) - 'a']--;
            
            hash_array[str.charAt(i-winSize) - 'a']++;
            
            count += (isCountZero(hash_array))? 1: 0;
        }
        
        return count;
    }
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to count the sub-string in a string if the order of characters doesn't matter\n");
        System.out.println("Enter string(only lowercase alphabets[a-z]):");
        String str = sc.nextLine();
        System.out.println("Enter sub-string:");
        String substr = sc.nextLine();
        
        System.out.print("Count: ");
        System.out.println((new Substring()).substring(str.toLowerCase(), substr.toLowerCase()));
        sc.close()
    }
    
}
