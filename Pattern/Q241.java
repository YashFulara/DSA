import java.util.Scanner;
class Q241{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of rows ");
        int n=input.nextInt();
        input.close();
        printPattern(n);
    }
    static void printPattern(int n){
       
        for (int i = 1; i <=n; i++) {
            int num=i;
            for (int j = 1; j <=n; j++) {
                if(j%2==1){//for odd col
                    System.out.printf("%3d",getNumber(i, j, num, n));
                    // num+=2*n-2*i+1; 
                    // we can also do like this ive spent an hour in figuring out this logic just to find that this question is to be done by function but still if in interview they put condition :( 
                    
                }else{//this is for even col
                    
                    System.out.printf("%3d",getNumber(i, j, num, n));
                    // num=num+2*i;/ this is also right
                }
            }
            
            System.out.println();
        }
    }
    static int getNumber(int i,int j,int num,int n){
        if (j%2==1) {
            return num=n*(j-1)+i;

        }
        else{
            return num=n*(j-1)+(n-i+1);
        }

    }
}