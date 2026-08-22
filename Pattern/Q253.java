
import java.util.Scanner;
class Q253{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of rows ");
        int n=input.nextInt();
        input.close();
        printPattern(n);
    }
    static void printPattern(int n){
       int num=1;
       int space=n-1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=space; j++) {
                System.out.printf("%3s","");
            }

           
            for (int j = 1; j <=i; j++) {
                if(i%2==1){//for odd row
                    System.out.printf("%3d",num);
                    num--;
                
                }else{//this is for even row
                    
                    System.out.printf("%3d",num);
                    num++;
                }
            }
            if (i%2==1) {
                num+=i+1;
            } else { 
                num+=i;
            }
            space--;
            System.out.println();
        }
    }
}