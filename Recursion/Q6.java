package Recursion;
public class Q6 {
    public static void main(String[] args) {
        int n=1;
       int value=getSquare(n);
       System.out.println("Square is "+ value);
    }
    public static int getSquare(int n){
        if(n>100){
            return 0;
            
        }
        return n*n*n+getSquare(n+1);
    }
}
