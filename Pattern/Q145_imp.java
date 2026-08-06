import java.util.Scanner;
public class Q145_imp {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the no of rows");
       int n=input.nextInt();
       input.close();
       printPattern(n);
   } 
   static void printPattern(int n){
    int space=n/2+1;
    int patternSize=1;
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=space; j++) {
            System.out.print("   ");
        }
        for (int j = 1; j <=patternSize; j++) {
            System.out.print(i+"     ");
        }
        if (i<n/2+1) {
            patternSize++;
            space--;
        } else {
            patternSize--;
            space++;
        }
        System.out.println();
    }

   }
}
