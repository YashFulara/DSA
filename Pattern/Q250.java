
import java.util.Scanner;
class Q250{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of rows ");
        int n=input.nextInt();
        input.close();
        printPattern(n);
    }
    static void printPattern(int n){
       int num=3*n;
        for (int i = 1; i <=n; i++) {
           
            for (int j = 1; j <=i; j++) {
                if(i%2==1){//for odd row
                    System.out.printf("%3s",(char)(num+64));
                    num--;
                
                }else{//this is for even row
                    
                    System.out.printf("%3s",(char)(num+64));
                    num++;
                }
            }
            if (i%2==1) {
                num-=i;
            } else { 
                num-=i+1;
            }
            
            System.out.println();
        }
    }
}