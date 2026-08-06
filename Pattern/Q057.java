import java.util.Scanner;

public class Q057 {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.err.println("Enter no of Rows ");
    int n=input.nextInt();
    printPattern(n);
    input.close();
}
    static void printPattern(int n){
        int space=n-1;
        int num=1;
        for(int i=1;i<=n;i++){
            for (int j = 1; j<=space; j++) {
                System.out.print("   ");
            }
            for(int j =1;j<=i;j++)//till i beacause 2nd row has 2 no. and 3rd has 3 no. and so now no need to trace till nth col
            {
                System.out.printf("%3d", num++);
                
            }
            space--;
            System.out.println();
        }
    }
}