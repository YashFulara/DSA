package WhileLoop3;
/**
 * Q029_PowerOfFour
 * Leetcode-342
 */
public class Q029_PowerOfFour {
public static void main(String[] args) {
    int n=Integer.parseInt(IO.readln("Enter the no "));
    System.out.println(isPowerOfFour(n));
}
  public static boolean isPowerOfFour(int n) {
        if(n==0){
            return false;
        }
        while(n>0){
           if(n==1) return true;
           if(n%4!=0) break;
           n=n/4;
        }
        return false;
    }
    
}
