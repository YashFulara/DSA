import java.util.Scanner;
class Q267{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of rows ");
        int n=input.nextInt();
        input.close();
        printPattern(n);
    }
    static void printPattern(int n){
        
        int start=1;
        int end=n;
        for (int i = 1; i <=n; i++) {
            
            for (int j = 1; j <=n; j++) {
                if(j<start){
                    System.out.printf("%3s","*");
                    
                }else if(j>=end){
                    
                    System.out.printf("%3s","*");
                }
                else{
                    System.out.printf("%3s","@");
                }
            }
            if (i<n/2+1) {
                start++;
                end--;
            } 
            else {
                start--;
                end++;
                
            }
            System.out.println();
        }
    }
}