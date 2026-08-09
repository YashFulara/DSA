import java.util.Scanner;
public class Q028_imp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.print("Enter number of rows : ");
        int n = input.nextInt();
        input.close();
        if(n%2!=0){
        patternPrint(n);
        }else{
            System.out.println("Please enter odd Number");
        }

    }
    static void patternPrint(int n){
        int start=1;
        int end=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (j<=start || j>=end) {
                    System.out.print("* ");
                    
                } else {
                    System.out.print("  ");
                    
                }


            }
            if(i<n/2+1){
                start+=1;
                end-=1;
            }else{
                start-=1;
                end+=1;
            }
            System.out.println();
        }
        

    }
}
