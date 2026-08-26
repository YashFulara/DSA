public class Q4 {
    public static void main(String[] args) {
        int n=1;
       int value=getSum(n);
       System.out.println("sum is "+ value);
    }
    public static int getSum(int n){
        if(n>100){
            return 0;
            
        }
        return n+getSum(n+1);
    }
}
