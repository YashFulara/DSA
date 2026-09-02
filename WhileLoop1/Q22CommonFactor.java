package WhileLoop1;
// LeetCode-Q2427
public class Q22CommonFactor {
    public static void main(String[] args) {
        int a=Integer.parseInt(IO.readln("Enter the first no."));
        int b= Integer.parseInt(IO.readln("Enter the second no."));
        System.out.println("count of common factors is "+commonFactors(a, b));
    }
    public static int commonFactors(int a, int b) {
        int count=0;
        int factor=1;
        while(factor<=a){
           if(a%factor==0 && b%factor==0){
            count++;
           } 
           factor++;
        }
        return count;
    }
}

