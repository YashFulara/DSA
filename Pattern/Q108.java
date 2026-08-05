import java.util.Scanner;
public class Q108 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter no of rows ");
        int n= input.nextInt();
        printPattern(n);
        input.close();
    }
    static void printPattern(int n){
        int space=n-1;
        int patternSize=1;
        int num=n;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=space; j++) {
                System.out.print("  ");
            }
            for (int j =1; j <=patternSize; j++) {
                System.out.print((char)(num+64)+" ");
                
            }
            num--;
            space--;
            patternSize+=2;
            System.out.println();

            
        }
    }
}
