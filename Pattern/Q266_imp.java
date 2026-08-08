import java.util.Scanner;
class Q266_imp{
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
            int num=n/2+1;
            for (int j = 1; j <=n; j++) {
                if(j<start){
                    System.out.printf("%3d",num--);
                    
                }else if(j>=end){
                    
                    System.out.printf("%3d",num++);
                }
                else{
                    System.out.printf("%3d",num);
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