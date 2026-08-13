import java.util.Scanner;

public class Q273 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter no. of rows ");
        int n=Integer.parseInt(input.nextLine());
        input.close();
        printPattern(n);
    }
    static void printPattern(int n){
        int space=n/2;
        int patternSize=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=patternSize; j++) {
                
                System.out.print("*");
            }
            if (i<n/2+1) {
                patternSize+=2;
                space--;
            } else {
                patternSize=1;
                space=n/2;
            }
            System.out.println();
            
        }
    }
}
