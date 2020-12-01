public class Ans4{
    public static void main(String[] args){
        long n=1;
        long sumUptoN = 1;
        while(n<Integer.MAX_VALUE){
            if(sumUptoN==n*n && n!=1){
                System.out.println("Answer: "+n);
            }
            n=n+1;
            sumUptoN=sumUptoN+n;
        }
        System.out.println("Last value of n is "+n+ " and Sum upto n is "+sumUptoN);
    }
}
