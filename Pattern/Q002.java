import java.util.Scanner;
public class Q002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.print("Enter number of rows : ");
        int n = input.nextInt();
        patternPrint(n);
    }
    static void patternPrint(int n){
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n;j++){
                System.out.print(i%2+" ");
            }
            System.out.println();
        }

    }
}