package WhileLoop2;
// LeetCode-Q2894
public class Q06_DivisibleAndNonDivisibleDifference {
public static void main(String[] args) {
    int n=Integer.parseInt(IO.readln("Enter the no. "));
    int m=Integer.parseInt(IO.readln("Enter the no. you want to check divisibility "));
    System.out.println("Difference is "+ divisibleAndNonDivisibleDifference(n, m));
}
public static int divisibleAndNonDivisibleDifference(int n,int m){
    int check=1;
    int divisible=0;
    int notDivisible=0;
    while (check<=n) {
        if (check%m==0) {
            divisible+=check;
        }
        else{
            notDivisible+=check;
        }
        check++;

    }
    return notDivisible-divisible;
}
    
}