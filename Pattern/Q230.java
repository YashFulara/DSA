import java.util.Scanner;
public class Q230 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("enter the no of sequence ");
    int n=input.nextInt();
    input.close();
    printPattern(n);

  }  
  static void printPattern(int n){
    int num=1;
    for (int i = 1; i <=n; i++) {
        System.out.print(num+" , ");
        if (i%2==1) {
            num++;
        } else {
            num+=num*2;
        }
    }
  }
}
