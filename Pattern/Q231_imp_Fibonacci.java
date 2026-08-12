import java.util.Scanner;
public class Q231_imp_Fibonacci {//is basically number is sum of previous number and number previsous to that no. example third digit is 1 as 0(first digit)+1(second digit)
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("enter the no of sequence ");
    int n=input.nextInt();
    input.close();
    printPattern(n);

  }  
  static void printPattern(int n){
    int num1=0;
    int num2=1;
    for (int i =0; i <n; i++) {
      
        System.out.print(num1+" , ");
        int temp=num1+num2;
        num1=num2;
        num2=temp;     
      }
  }
}
