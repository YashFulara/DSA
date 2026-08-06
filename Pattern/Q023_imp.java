import java.util.Scanner;

public class Q023_imp{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter no of rows ");
        int n=input.nextInt();
        if(n%2!=0){
        printPattern(n);
        }
        else{
            System.out.print("please enter odd no.");
        }
        input.close();
    }
    public static void printPattern(int n){
        int patternSize=1;
        int space=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
             System.out.print("  ");
            }
            for(int j=1;j<=patternSize;j++){
             System.out.print("*   ");
            }
        if(i<n/2+1){
            patternSize+=1;
            space-=1;

        }
        else{
            patternSize-=1;
            space+=1;
        }
            
        
       
        System.out.println();
        }


    }
}


