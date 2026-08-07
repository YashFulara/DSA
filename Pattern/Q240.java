import java.util.Scanner;
class Q240{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of rows ");
        int n=input.nextInt();
        input.close();
        printPattern(n);
    }
    static void printPattern(int n){
        int num=n*n;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(i%2==1){
                    System.out.printf("%3d",num--);
                    
                }else{
                    
                    System.out.printf("%3d",num++);
                }
            }
            if (i%2==1) {
                num-=n-1;
            } 
            else {
                num-=n+1;
                
            }
            System.out.println();
        }
    }
}