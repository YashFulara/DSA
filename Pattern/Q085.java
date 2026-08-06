import java.util.Scanner;
public class Q085 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.print("Enter number of rows : ");
        int n = input.nextInt();
        patternPrint(n);
        input.close();

    }
    static void patternPrint(int n){
        int space=n-1;
        int num=1;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=space;j++){
                System.out.print("   ");


            }
            for(int j=1;j<=i;j++){
                System.out.print((char)(num+64)+"     ");
                num++;
            }
            space--;
            
            System.out.println();
        }
        

    }
}

