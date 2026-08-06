
import java.util.Scanner;
public class Q099_imp{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of rows :");
        int n= input.nextInt();
        printPattern(n);
        input.close();
    }
    static void printPattern(int n){
        int space=n-1;
        int patternSize=1;
        int num=0;
         // int col_mid= (patternSize/2)+1; im not creating variable beacause i will use expression directly in if else conditon
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j<=space; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <=patternSize; j++) {
                if (j<(patternSize/2)+1) {
                    System.out.printf("%3d",num--);
                } else {
                    System.out.printf("%3d",num++);
                }
            }
            
            space--;
            patternSize+=2;
            System.out.println();

            
        }
    }

}
