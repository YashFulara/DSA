import java.util.Scanner;
public class Q232_imp_TribonacciSeries {
  public static void main(String[] args) {// just like fabonacci but sum of three terms
    Scanner input=new Scanner(System.in);
    System.out.println("enter the no of sequence ");
    int n=input.nextInt();
    input.close();
    printPattern(n);

  }  
  static void printPattern(int n){
    int num1=-1;
    int num2=0;
    int num3=1;
    for (int i =1; i <=n; i++) {
      
        System.out.print(num2+" , ");
        int temp=num1+num2+num3;
        num2=num3;
        num1=temp;
    }
  }
}
