public class Q2 {
    public static void main(String[] args) {
        int n=Integer.parseInt(IO.readln("Enter the no from which you want to print in decending order(10 as per question) "));
        getNumbers(n);
    }
    static int getNumbers(int n){
        while (n>=1) {
            System.out.println(n);
            return getNumbers(n-1);
        }
        return 0;
    }
}
