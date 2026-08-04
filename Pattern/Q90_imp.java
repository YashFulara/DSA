import java.util.Scanner;
public class Q90_imp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of rows :");
        int n= input.nextInt();
        printPattern(n);
        input.close();
    }
    static void printPattern(int n){
        int space=n-1;
        int patternSize=1;
        
        for (int i = 1; i <= n; i++) {
            int num=1;
            for (int j = 1; j<=space; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <=patternSize; j++) {
                System.out.print(num+++"  ");
            }
            num--;
            space--;
            patternSize+=2;
            System.out.println();

            
        }
    }

}
