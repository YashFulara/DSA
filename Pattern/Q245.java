
import java.util.Scanner;
class Q245{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of rows ");
        int n=input.nextInt();
        input.close();
        printPattern(n);
    }
    static void printPattern(int n){
       int num=1;
        for (int i = 1; i <=n; i++) {
           
            for (int j = 1; j <=i; j++) {
               System.out.printf("%3d%3s",getNumber(n, i, j, num),"");
                    
            }
            System.out.println();
        }
    }
    static int getNumber(int n,int i,int j,int num){
        if (j%2==1) {
            return num=n*(j-1)+i;
        } else {
            return num=n*(j-1)+(n-i+1);
        }

    }
}