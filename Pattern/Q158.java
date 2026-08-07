import java.util.Scanner;
class Q158{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n= input.nextInt();
        input.close();
        printPattern(n);
    }
    static void printPattern(int n){
        int space=n/2+1;
        int patternSize=1; 
        // int num=n/2+1; we can also use space instead of num var as space holds the same value as num will
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=space; j++) {
                System.out.print("   ");
                
            }
            for (int j = 1; j <=patternSize; j++) {
                System.out.print((char)(space+64)+"     ");
            }
            if (i<n/2+1) {
                space--;
                patternSize++;
            } else {
                space++;
                patternSize--;
            }
            System.out.println();
        }
    }
}