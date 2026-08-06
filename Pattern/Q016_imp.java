import java.util.Scanner;
public class Q016_imp{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.print("Enter number of rows : ");
        int n = input.nextInt();
        patternPrint(n);
    }
    static void patternPrint(int n){
        int star=1;
        int space=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            space-=1;
            star+=1;
            System.out.println();
        }
        

    }
}
