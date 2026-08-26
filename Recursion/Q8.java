package Recursion;

public class Q8 {
    public static void main(String[] args) {
        int  n=Integer.parseInt(IO.readln("Enter the no "));
        int p=Integer.parseInt(IO.readln("Enter the power of no that you want to calculate "));
        System.out.println("The calculated no is "+getPow(n,p));
    }
    public static int getPow(int n,int p){
        if (p==0 && n==0) {
            return 0;
        }
        else if(p==0){
            return 1;
        }
        return n*getPow(n, p-1);
    }
}
