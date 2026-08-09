 import java.util.Scanner;
public class Q190{
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
    int space=n/2;
    int patternSize=1;
    int num=1;
    for (int i = 1; i <=n; i++) {
      
        for (int j = 1; j <=space; j++) {
            System.out.print("   ");
        }
        for (int j =1; j <=patternSize; j++) {
            System.out.print((char)(num+64)+"  ");
            
        }
        if (i<n/2+1) {
            space--;
            patternSize+=2;
           num++;
        } 
        else {
            space++;
            patternSize-=2;
            num--;
        }
        
        System.out.println();
    }
   }
}