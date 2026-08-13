

public class Q282 {
    public static void main(String[] args) {
        int n=Integer.parseInt(IO.readln("Enter the no of rows "));
        
        printPattern(n);
    }
    static void printPattern(int n){
        int space=n/2-1;
        int patternSize=n;
        for (int i = 1; i <=n; i++){ 
            for (int j =1; j <=space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=patternSize; j++) {
                
                System.out.print("*");
            }
            if (i<=n/2-1) {
                space--;
                patternSize+=2;
            } else if(i==n/2){
                //no need to change any value of space and patternSize
                
            }
            else if (i==n/2+1){
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
