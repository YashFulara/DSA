import java.util.Scanner;
public class Q224_imp {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter no of rows ");
        int n= input.nextInt();
        input.close();
        if (n%2==1) {
            printPattern(n);
        } else {
            System.out.println("Please enter odd no. ");
        }
    }
    static void printPattern(int n){
        int start=1;
        int end=n;
        
        for (int i = 1; i <=n; i++) {
            int num=1;
            for (int j = 1; j <=n; j++) {
                if (j<=start||j>=end) {
                    System.out.printf("%3s",(char)(num+64));
                    num++;
                } else {
                    System.out.printf("%3s","");
                }
                
            }
            if (i<n/2+1) {
                start++;
                end--;

            } else {
                start--;
                end++;
            }
            System.out.println();
            
        }
    }
}
