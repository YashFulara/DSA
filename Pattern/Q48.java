import java.util.Scanner;

public class Q48 {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.err.println("Enter no of Rows ");
    int n=input.nextInt();
    printPattern(n);
    input.close();
}
    static void printPattern(int n){
        int num=3*n;
        
        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++)//till i beacause 2nd row has 2 no. and 3rd has 3 and so now no need to trace till nth col
            {
                System.out.print((char)(num+64)+"   ");
                num--;
            }

            System.out.println();
        }
    }
}