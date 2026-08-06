import java.util.Scanner;
public class Q117 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter no of rows ");
        int n= input.nextInt();
        printPattern(n);
        input.close();
    }
    static void printPattern(int n){
        int space=0;
        int patternSize=n;
        int num=1;
        for (int i = 1; i <=n; i++) {
            
            for (int j = 1; j <=space; j++) {
                System.out.print("  ");
            }
            for (int j =1; j <=patternSize; j++) {
               System.out.printf("%4d",num++);
            }
            space++;
            patternSize-=1;
            System.out.println();

            
        }
    }
}