import java.util.Scanner;
public class Q133_imp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ENter no of rows ");
        int n=input.nextInt();
        input.close();
        printPattern(n);
    }
    static void printPattern(int n){
        int space=0;
        int patternSize=2*n-1;
        
        for (int i = 1; i <=n; i++) {
            int num=1;
            for (int j = 1; j <=space; j++) {
                System.out.print("    ");
            }
            for (int j = 1; j <=patternSize; j++) {
                if (j<patternSize/2+1) {
                    System.out.printf("%4d",num++);
                } else {
                    System.out.printf("%4d",num--);
                } 
            }
            space++;
            patternSize-=2;
            System.out.println();
            
        }
    }
}
