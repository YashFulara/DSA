package WhileLoop3;

public class Q037 {
    public static void main(String[] args) {
        int num=Integer.parseInt(IO.readln("Enter no "));
        System.out.println(isSameAfterReversals(num));
    }
    public static boolean isSameAfterReversals(int num) {
       int n=num;
       int rev1=getDoubleReverse(num);
       if (rev1==n) {
            return true;
       }
       return false;
    }
    public static int  getDoubleReverse(int num){
        int rev1=0;
        while(num>0){
            rev1=rev1*10+num%10;
            num=num/10;
        }
        getDoubleReverse(rev1);
        return rev1;
        }
}
