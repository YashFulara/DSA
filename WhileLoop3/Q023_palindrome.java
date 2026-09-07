package WhileLoop3;
//LeetCode-Q9
public class Q023_palindrome {
    public static void main(String[] args) {
        int n=Integer.parseInt(IO.readln("Enter your no "));
        int rev=0;
        int copy=n;
        while(n>0){
           rev=(rev*10)+n%10;
           n=n/10;
        }
        System.out.println("reversed no is "+rev);
        if (rev==copy) {
           System.out.println("No. is palindrome"); 
        }else{
        System.out.println("no. is not palindrome");
        }
    }
}
