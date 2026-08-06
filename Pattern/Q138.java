import java.util.Scanner;
public class Q138 {
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
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=space; j++) {
                System.out.print("  ");
           } 
           for (int j = 1; j <=patternSize; j++) {
                System.out.print((char)(j+64)+" " );//here j is starting from 1 till patternSize for every row so we can skip using num var
           }
           space++;
           patternSize-=2;
           System.out.println();
        }
    
    }
}
