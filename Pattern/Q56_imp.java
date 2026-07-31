import java.util.Scanner;
public class Q56_imp {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in); 
     System.out.println("enter number of rows:");
     int n=input.nextInt();
     input.close();
     printPattern(n);
   }  
   public static void printPattern(int n){
        int star=1;
        int space=n-1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=space;j++){
            System.out.print("  ");
        }
        for(int j=1;j<=star;j++){
            System.out.print(i%2+" ");
        }
    
        space-=1;
        star+=1;
        System.out.println();
    }

   }
}
