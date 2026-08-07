import java.util.Scanner;
class Q152{
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
        int num=n;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=space; j++) {
                System.out.print("   ");
                
            }
            for (int j = 1; j <=patternSize; j++) {
                System.out.printf("%6d",num);
            }
            if (i<n/2+1) {
                space--;
                patternSize++;
            } else {
                space++;
                patternSize--;
            }
            num--;
            System.out.println();
        }
    }
}