import java.util.Scanner;
public class Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.print("Enter number of rows : ");
        int n = input.nextInt();
        patternPrint(n);
    }
    static void patternPrint(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i<=2||i>=n-1||j<=2||j>=n-1) {
                    System.out.print("* ");
                    
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
