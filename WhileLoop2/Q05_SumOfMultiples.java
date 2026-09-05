package WhileLoop2;
//LeetCode-2652
public class Q05_SumOfMultiples {
    public static void main(String[] args) {
        int n=Integer.parseInt(IO.readln("Enter no "));
        System.out.println("Sum is "+ sumOfMultiples(n));
    }
    public static int sumOfMultiples(int n){
        int check=1;
        int num=0;
        while (check<=n) {
            if (check%3==0 || check%5==0||check%7==0) {
                num+=check;
            }
            check++;
        }
        return num;
    }
}
