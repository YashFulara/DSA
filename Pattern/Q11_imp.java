import java.util.Scanner;
public class Q11_imp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.print("Enter number of rows : ");
        int n = input.nextInt();
        if (n%2!=0) {
            patternPrint(n);
            
        } else {
            System.out.println("Please enter odd Number");
        }
        
    }
    static void patternPrint(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i==n/2+1||j==n/2+1||i==1 & j>n/2+1 || i==n & j<n/2+1 ||j==1 & i<n/2+1 || j==n & i>n/2+1) {
                    System.out.print("* ");
                    
                } else {
                    System.out.print("  ");
                }

            }
        System.out.println();
        }

    }
}
