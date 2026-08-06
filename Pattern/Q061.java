import java.util.Scanner;
public class Q061 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter no. of Rows: ");
        int n=input.nextInt();
        printPattern(n);
        input.close();
    }
    static void printPattern(int n){
        int space=n-1;
        int num=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("   ");
                
            }
            for (int j = 1; j <=i; j++) {
                System.out.printf("%3d",num--);
                
            }
            space--;
            num=num+2*i+1;
            System.out.println();

        }
        
    }
    
}
