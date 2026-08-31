package WhileLoop1;
public class Q16_imp {
public static void main(String[] args) {
    int n=Integer.parseInt(IO.readln("Enter the no to print all its factors "));
    int factor=1;
    while (factor<=n) {
        if (n%factor==0) {
            System.out.print(factor+"  ");
        }
        factor++;
    }
}
    
}