import java.util.Scanner;
public class Q042 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
    System.out.print("Enter number of rows : ");
        int n = input.nextInt();
        printPattern(n);
        input.close();
    }
    public static void printPattern(int n){
        // int star=1;
        
        for(int i=1;i<=n;i++){
            int num=i;
            for(int j=1;j<=i;j++){
                System.out.print(num--+" ");


            }
            // star++;star is not needed as star is holding the same value as of i
            System.out.println();
        }

    }
}
