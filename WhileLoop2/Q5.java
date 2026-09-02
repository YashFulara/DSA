package WhileLoop2;
//LeetCode-2652
public class Q5 {
    public static void main(String[] args) {
        int n=Integer.parseInt(IO.readln("Enter no "));
        System.out.println("Sum is "+ sumOfMultiples(n));
    }
    public static int sumOfMultiples(int n){
        int check=1;
        int num=0;
        while (check<=n) {
            if (n%3==0 || n%5==0||n%7==0) {
                num+=n;
            }
            check++;
        }
        return num;
    }
}
