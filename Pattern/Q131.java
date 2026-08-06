import java.util.Scanner;
public class Q131 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter no of rows ");
        int n= input.nextInt();
        input.close();
        printPattern(n);
    }
    static void printPattern(int n){
        int space=0;
        int patternSize=2*n-1;
        // int num=1; im directly giving the expression instead of varible in print statement ie n+1-i
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=space; j++) {
                System.out.print("    ");
           } 
           for (int j = 1; j <=patternSize; j++) {
                System.out.printf("%4d",(n+1-i));
           }
           space++;
           patternSize-=2;
           System.out.println();
        }
    
    }
}
