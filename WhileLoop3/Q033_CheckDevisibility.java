package WhileLoop3;
//Leetcode-3622
public class Q033_CheckDevisibility {
    public static void main(String[] args) {
        int n=Integer.parseInt(IO.readln("Enter the no"));
        System.out.println(checkDivisibility(n));
    }
    public static boolean checkDivisibility(int n) {
        int copy=n;
        int sum=0;
        int p=1;
        while(copy>0){
            sum+=copy%10;
            p=p*(copy%10);
            copy=copy/10;
        }
        if(n%(sum+p)==0){
            return true;
        }
         return false;
       
    }
}
