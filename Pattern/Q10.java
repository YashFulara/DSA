import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.print("Enter number of rows : ");
        int n = input.nextInt();
        if (n%2!=0) {
            patternPrint(n);
        }else{
            System.out.println("Pleasse enter odd Number");
        }
        
    }
    
    static void patternPrint(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i==1||i==n||j==n||j==1||i==j||i+j==n+1||i==n/2+1||j==n/2+1) {
                    System.out.print("* ");
                    
                }else{
                    System.out.print("  ");
                }
            }
        System.out.println();
        }

    }
}
