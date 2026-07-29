import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.print("Enter number of rows : ");
        int n = input.nextInt();
       
        patternPrint(n);
      
    }
    static void patternPrint(int n){
        int star=7;
        int space=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            star-=1;
            space+=1;
            System.out.println();
        }

    }
}
