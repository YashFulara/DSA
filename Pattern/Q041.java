import java.util.Scanner;
public class Q041 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
    System.out.print("Enter number of rows : ");
        int n = input.nextInt();
        printPattern(n);
        input.close();
    }
    public static void printPattern(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");

            }
            
            System.out.println();
        }

    }
}
