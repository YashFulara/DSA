 import java.util.Scanner;
public class Q206{
   public static void main(String[] args) {
    Scanner input= new java.util.Scanner(System.in);
    System.out.println("Enter the no of rows ");
    int n=input.nextInt();
    input.close();
    if (n%2==1) {
            printPattern(n);
        } else {
            System.out.println("Please enter odd no. ");
        }

   } 
   static  void printPattern(int n){
    int space=0;
    int patternSize=n;
    int num=n;
    for (int i = 1; i <=n; i++) {
         
        for (int j = 1; j <=space; j++) {
            System.out.printf("%4s","");
        }
        for (int j =1; j <=patternSize; j++) {
            System.out.printf("%4d",num);
        }
        if (i<n/2+1) {
            space++;
            patternSize-=2;
           num--;
        } 
        else {
            space--;
            patternSize+=2;
           num++;
        }
        
        System.out.println();
    }
   }
}