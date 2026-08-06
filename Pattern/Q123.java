import java.util.Scanner;
public class Q123 {
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
        // int num=n; no need for num as our patternSize is also starting from n and goes till 1 so patterSize will have same value as of num thats why we skip using it 
        for (int i = 1; i <=n; i++) {
            
            for (int j = 1; j <=space; j++) {
                System.out.print("  ");
            }
            for (int j =1; j <=patternSize; j++) {
               System.out.print((char)(patternSize+64)+"   ");
            }
            space++;
            patternSize-=1;
            System.out.println();

            
        }
    }
}