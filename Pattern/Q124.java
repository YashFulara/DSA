import java.util.Scanner;
public class Q124 {
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
        int num=n; 
        for (int i = 1; i <=n; i++) {
            
            for (int j = 1; j <=space; j++) {
                System.out.print("  ");
            }
            for (int j =1; j <=patternSize; j++) {
               System.out.print((char)(patternSize+64)+"   ");
               num--;
            }
            space++;
            patternSize-=1;
            System.out.println();

            
        }
    }
}