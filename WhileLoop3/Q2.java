package WhileLoop3;

public class Q2 {
  public static void main(String[] args) {
      int n=Integer.parseInt(IO.readln("Enter the no. "));
      while (n>0) {
        int last=n%10;
        if (last%2==0) {
            System.out.println(last);
        }
        n=n/10;
      }
  }
}
