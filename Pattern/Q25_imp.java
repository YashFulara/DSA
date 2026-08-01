import java.util.Scanner;
public class Q25_imp{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.print("Enter number of rows : ");
        int n = input.nextInt();
        patternPrint(n);
    }
    static void patternPrint(int n){
        int space=n/2;
        int star=1;
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            if(i<n/2+1){
            star+=2;
            space-=1;
            }else{
                star-=2;
                space+=1;

            }
            System.out.println();
        }

        

    }
}