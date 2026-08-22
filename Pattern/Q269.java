public class Q269 {
    public static void main(String[] args) {
    int n=Integer.parseInt(IO.readln("Enter no of rows(odd please)"));
    if(n%2==0){
        System.out.println("Please enter odd no");
        return;
    }
    printPattern(n);
}
 static void printPattern(int n){
    int space=n/2;
    int endPoint=(5*n)/2 +1;
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=(n/2+1); j++) {
            if(j<=space){
                System.out.print("  ");
            }else{
                System.out.print("* ");
            }
        }
        for (int j = (n/2+1); j <=n+1; j++) {
            if (i==1||(j==2*n & i<=n/2+1)) {
                System.out.print("@ ");
            }else{
                System.out.print("  ");
            }
        }
        for (int j = n+2; j <=2*n-1; j++) {
           if (i>n/2+1) {
            System.out.print("* ");
           } else {
            System.out.print("  ");
           }
        }
        for (int j = 2*n; j <=2*n+(n/2); j++) {
            if ((j==2*n & i<=n/2+1)||i==1) {
                System.out.print("@ ");
            } else {
               System.out.print("  "); 
            }
        }
        for (int j = (5*n/2)+1; j <=endPoint; j++) {
            if(j<=endPoint){
                System.out.print("* ");
            }
        }
     if (i<n/2+1) {
        space--;
        endPoint++;
     } else {
       space++;
       endPoint--; 
     }
     System.out.println();   
    }
 }
}
