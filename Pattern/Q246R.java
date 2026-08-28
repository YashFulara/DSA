public class Q246R {
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
}
static int getNumber(int n, int i,int j){
    int num=0;
    for (int k = 1; k <=j; k++) {
        num=num+(num--);
    }
    if (j%2==1) {
        return num=num+(n-i+1);
    } else {
        return num=num+i-(j-1);
    }
}
}
