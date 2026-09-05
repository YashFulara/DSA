package WhileLoop1;

public class Q06 {
    public static void main(String[] args) {
        int n=Integer.parseInt(IO.readln("Enter no of bulbs: "));
        System.out.println(bulbSwitcher(n));
    }
    static int bulbSwitcher(int n){
        int countOn=n;
        int countOff=0;
        int pos=1;
        while (pos<=n) {
            if (pos<n%2) {
                countOn+=pos;
                pos++;
            }
            else{
                countOn+=1;
            }
           
        }
        return countOn;
    }
}
