package WhileLoop3;
// LeetCode-3099
public class Q047_HashardNo {
    public static void main(String[] args) {
        int x=Integer.parseInt(IO.readln("Enter the no. "));
        System.out.println(sumOfTheDigitsOfHarshadNumber(x));
    }
     public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int copy=x;
        while(x>0){
            sum+=x%10;
            x/=10;
        }
        if(copy%sum==0){
            return sum;
        }
        return -1;
    }
}
