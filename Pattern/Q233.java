public class Q233 {
  public static void main(String[] args) {
    int n=Integer.parseInt(IO.readln("enter the no of sequence "));
    printPattern(n);
  }  
  static void printPattern(int n){
    int num=1;
    for (int i = 1; i <=n; i++) {
        System.out.print((num)+", ");
        num+=i*(i+1);
    }
  }
}
