package WhileLoop3;
// LeetCode-172
public class Q026_factorialTrailingZeros {
    public static void main(String[] args) {
       int n=Integer.parseInt(IO.readln("Enter the no ")); 

       System.out.println(trailingZeroes(n));
    }
    
    public static int trailingZeroes(int n) {
        int count=0;
        while(n>4){
            count+=n/5;
            n=n/5;
     }
     return count;
    }
}
