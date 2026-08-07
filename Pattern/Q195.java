 import java.util.Scanner;
public class Q195{
   public static void main(String[] args) {
    Scanner input= new java.util.Scanner(System.in);
    System.out.println("Enter the no of rows ");
    int n=input.nextInt();
    input.close();
    printPattern(n);

   } 
   static  void printPattern(int n){
    int space=0;
    int patternSize=n;
    
    for (int i = 1; i <=n; i++) {
    
        for (int j = 1; j <=space; j++) {
            System.out.print("  ");
        }
        for (int j =1; j <=patternSize; j++) {
            System.out.print(i%2+" ");
            
        }
        if (i<n/2+1) {
            space++;
            patternSize-=2;
           
        } 
        else {
            space--;
            patternSize+=2;
           
        }
        
        System.out.println();
    }
   }
}

