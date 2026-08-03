import java.util.Scanner;
public class Q65 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter no. of rows ");
        int n=input.nextInt();
        input .close();
        printPattern(n);
    }
    static void printPattern(int n){
        int space=n-1;
        int num=1;
        for (int i = 1; i <=n; i++) {
            
            for (int j = 1; j <=space; j++) {
                System.out.print("    ");//three space is required here for dealing with the two digit pattern problem
            }
            for (int j = 1; j <=i; j++) {
                System.out.print((char)(num+64)+"   ");
                num++;
            }
            space--;
            
            System.out.println();
        }
    }
}
