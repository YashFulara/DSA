package WhileLoop1;
public class Q18_imp {
public static void main(String[] args) {
    int n=Integer.parseInt(IO.readln("Enter the no to print and  count of  its factors "));
    int factor=1;
    int count=0;
    while (factor<=n) {
        if (n%factor==0) {
            System.out.print("Factors are "+factor+"  ");
            count++;
        }
        factor++;
    }
    System.out.println("Total Factors are :"+count);
}
    
}