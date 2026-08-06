import java.util.Scanner;
public class Q014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.print("Enter number of rows : ");
        int n = input.nextInt();
        if (n%2!=0) {
            patternPrint(n);
        } else {
            System.out.println("Please enter ODD Number");
        }
    }
    static void patternPrint(int n){
        int star=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            System.out.println();
            if (i<n/2+1) {
                star+=1;
                
            } else {
                star-=1;
            }
        }
        

    }
}
