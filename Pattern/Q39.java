import java.util.Scanner;
public class Q39 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
    System.out.print("Enter number of rows : ");
        int n = input.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int digit=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=digit;j++){
                System.out.print(j+" ");

            }
            digit++;
            System.out.println();
        }

    }
}
