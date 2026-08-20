public class Q246_doubt {
public static void main(String[] args) {
    int n=Integer.parseInt(IO.readln("Enter the no of rows "));
    printPattern(n);
}   
static void printPattern(int n) {
    // int num=n;
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.printf("%3d%2s",getNumber(n, i, j),"");
        } 
        System.out.println();
        
    }
// int length = n - j + 1;
}
static int getNumber(int n,int i,int j){
    // int num=0;
    // for (int k = 1; k <=n*(n+1)/2; k++) {
    //     if (j%2==1) {
    //         return num+=n-i+1;
    //     } else {
    //         return num=;
    //     }
    // }
    // return 0;
    int start = 1 + (j - 1) * n - (j - 1) * (j - 2) / 2;
    int length = n - j + 1;

    if (j % 2 == 1) {
        return start + length - i;
    } else {
        return start + i - 1;
    }
}
}


