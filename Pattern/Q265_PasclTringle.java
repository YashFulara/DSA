import java.util.Scanner;
class Q265_PascalTriangle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of rows ");
        int n=input.nextInt();
        input.close();
        printPascalTriangle(n);
    }
    static void printPascalRow(int n){//special thing about pascal triangle is that for combination n and i are equal (in the formula of nCr)
        int comb=1;//comb represents combination
        System.out.print(comb+"   ");
        for (int i = 0; i <n; i++) {//we can think of i variable as positon(where number will be printed)here.
            comb=comb*(n-i)/(i+1);
            System.out.print(comb+"   ");
        }
    }
    static void printPascalTriangle(int n){
        int space=n;
        for (int i = 0; i <=n; i++) {//we think of i variable as row here
            for (int j = 1; j <=space; j++) {
                System.out.print("  ");
            }
            printPascalRow(i);
            System.out.println();
            space--;
        }
    }
    
}