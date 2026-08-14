public class Q235 {
    public static void main(String[] args) {
        int n = Integer.parseInt(IO.readln("Enter no of rows "));
        if (n%2==1) {
            printPattern(n);
        } else {
            System.out.println("Please enter odd no");
        }

    }
    static  void printPattern(int n){
    int space=n/2;
    int patternSize=1;
    
    for (int i = 1; i <=n; i++) {
      
        for (int j = 1; j <=space; j++) {
            System.out.print("  ");
        }
        for (int j =1; j <=patternSize; j++) {
            if (j==1||j==patternSize) {
                System.out.print(i+" ");
            } else {
                System.out.print("  ");
            }
            
            
        }
        if (i<n/2+1) {
            space--;
            patternSize+=2;
           
        } 
        else {
            space++;
            patternSize-=2;
            
        }
        
        System.out.println();
    }
   }
}
