public class Q234 {
    public static void main(String[] args) {
        int n=Integer.parseInt(IO.readln("Enter no of sequence"));
        printPattern(n);
    }
static void printPattern(int n){
    int num=1;
    for (int i = 1; i <=n; i++) {
        System.out.print((num)+", ");
        num+=2*i;
    }

}
    
}
