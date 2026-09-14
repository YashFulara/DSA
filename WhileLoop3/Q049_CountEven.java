package WhileLoop3;
// LeetCode-2180
public class Q049_CountEven {
    public static void main(String[] args) {
        int num=Integer.parseInt(IO.readln("Enter No."));
        System.out.println(countEven(num));
    }
 public static int countEven(int num) {
    
        int count=0;
        int check=1;
        while(check<=num){
            int sum=0;
            int copy=check;
            while(copy>0){
                 sum+=copy%10;
                 copy=copy/10;
            }
            if(sum%2==0){
                count++;
            }
            check++;
        }
        return count;
    }
    
}