import java.util.Scanner;
public class Q008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.print("Enter number of rows : ");
        int n = input.nextInt();
        if (n%2!=0) {
           patternPrint(n); 
        }else{
            System.out.println("Please enter odd Number");
        }
        
    }
    static void patternPrint(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i==j||i+j==n+1) {
                    System.out.print("* ");
                    
                }else{
                    System.out.print("  ");
                }
            }
        System.out.println();
        }
        

    }
}
