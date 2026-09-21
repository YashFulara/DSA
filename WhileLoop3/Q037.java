package WhileLoop3;

public class Q037 {
    public static void main(String[] args) {
        int num=Integer.parseInt(IO.readln("Enter no "));
        System.out.println(isSameAfterReversals(num));
    }
     public static
      boolean isSameAfterReversals(int num) {
       int n=num;
       int rev1=0;
       int rev2=0;
        while(num>0){
            rev1=rev1*10+num%10;
            num=num/10;
        }
        while(rev1>0){
            rev2=rev2*10+rev1%10;
            rev1=rev1/10;
        }
        if(n==rev2)
            return true;
        return false;
        
    }
    
}
