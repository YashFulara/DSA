package Recursion;
public class Q1 {
    public static void main(String[] args) {
        int n=1;
        getNumbers(n);
    }
    public static int getNumbers(int n){
        if (n>10) {
            return 0;
        }
        System.out.println(n);
        return getNumbers(n+1);
    }
}
