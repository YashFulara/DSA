 import java.util.Scanner;
public class Q174_imp{
   public static void main(String[] args) {
    Scanner input= new java.util.Scanner(System.in);
    System.out.println("Enter the no of rows ");
    int n=input.nextInt();
    input.close();
    printPattern(n);

   } 
   static  void printPattern(int n){
    int space=n/2;
    int patternSize=1;
    int num=1;
    for (int i = 1; i <=n; i++) {
        
        for (int j = 1; j <=space; j++) {
            System.out.printf("%4s","");
        }
        for (int j =1; j <=patternSize; j++) {
            if (j<patternSize/2+1) {
                System.out.printf("%4d",num--);
            }
            
            else {
                System.out.printf("%4d",num++);
            }
            
        }
        if (i<n/2+1) {
            space--;
            patternSize+=2;
           
        } 
        else {
            space++;
            patternSize-=2;
            num=n-i;
        }
        
        System.out.println();
    }
   }
}

