package WhileLoop3;
public class Q009 {
    public static void main(String[] args) {
        int n=Integer.parseInt(IO.readln("Enter your no"));
        int count=0;
        while (n>0) {
          int check=n%10;
           if (check==3) {
            count++;
           }
           n=n/10;
        }
        System.out.println(count);
    }
}
