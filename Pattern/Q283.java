

public class Q283 {
    public static void main(String[] args) {
        int n=Integer.parseInt(IO.readln("Enter the no of rows "));
        
        printPattern(n);
    }
    static void printPattern(int n){
        int space=1;
        int patternSize=n;
        int start=n/2;
        int end=n-1;
        for (int i = 1; i <=n; i++){ 
            for (int j =1; j <=space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=patternSize; j++) {
                if ((j==n/2 & i==1)|| (j==n/2+2 & i==2)) {
                    System.out.print(" ");
                }
                else {
                    if (j<=start||j>=end) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                }
                

            }
            if (i<n/2-1) {
                start++;
                end--;
                space--;
                patternSize+=2;
            } else if(i==n/2-1){
                
                //no need to change any value of space and 
            }
            else if(i==n/2){
                 
                patternSize-=2;
                space++;
            }
            else{
                space++;
                patternSize-=2;
            }
            System.out.println();
        }
    }
}
