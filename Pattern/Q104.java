import java.util.Scanner;
public class Q104 {
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
        int num=65;//starting num from 65 here only cause int 65 in char holds A
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=space; j++) {
                System.out.print("  ");
            }
            for (int j =1; j <=patternSize; j++) {
                System.out.print((char)(num++)+" ");
            }
            space--;
            patternSize+=2;
            System.out.println();

            
        }
    }
}
