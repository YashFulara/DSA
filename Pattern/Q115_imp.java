import java.util.Scanner;
public class Q115_imp {
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
        
        for (int i = 1; i <=n; i++) {
            
            for (int j = 1; j <=space; j++) {
                System.out.print("  ");
            }
            for (int j =1; j <=patternSize; j++) {
               System.out.print(j+"   ");//no need to take num variable as j holds the same value for every row it starts from 1 and ends at patternSize
            }
            space++;
            patternSize-=1;
            System.out.println();

            
        }
    }
}