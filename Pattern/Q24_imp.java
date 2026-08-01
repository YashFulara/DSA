import java.util.Scanner;
public class Q24_imp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int n=input.nextInt();
        if (n%2!=0) {
            printPattern(n);
        } else {
            System.out.println("please enter a odd no.");
        }
        input.close();
   } 
   static void printPattern(int n){
    int star=1;
    int space=n/2;
    for (int i = 1; i<=n; i++) {
        for (int j = 1; j <=space; j++) {
            System.out.print("  ");
            
        }
        for (int j = 1; j <=star; j++) {
            System.out.print("* ");            
        }
        if (i<n/2+1) {
            space--;
            star+=2;
        } else {
            space++;
            star-=2;
        }
        System.out.println();
    }

   }
    
}
