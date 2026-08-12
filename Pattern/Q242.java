import java.util.Scanner;
class Q242{
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
                if(j%2==1){//for odd col
                    System.out.printf("%3d",num);
                    num-=2*n-2*i+1;
                    
                }else{//this is for even col
                    
                    System.out.printf("%3d",num++);
                    num-=2*i;
                }
            }
            num=(n*n)-i;
            System.out.println();
        }
    }
}