package Recursion;
public class Q7 {
    public static void main(String[] args) {
        int n=Integer.parseInt(IO.readln("Enter no for which you want to calculate the factorial "));
        System.out.println("Factorial of "+n+" is "+getFact(n) );
    }
    public static int getFact(int n){
        if(n==0){
            return 1;
        }
        return n*getFact(n-1);
    }
}
