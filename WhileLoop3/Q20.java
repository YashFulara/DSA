package WhileLoop3;
public class Q20 {
    public static void main(String[] args) {
        int n=Integer.parseInt(IO.readln("Enter your no "));
        int rev=0;
        while(n>0){
           rev=(rev*10)+n%10;
           n=n/10;
        }
        System.out.println("reversed no is "+rev);
    }
}
