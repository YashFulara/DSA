package WhileLoop2;

public class Q11 {
    public static void main(String[] args) {
        
    
    int n=1;
    int sum=0;
    while(n<=100){
        
        if (n%2==1) {
            sum+=n*n;
        }
        n++;
        }
        System.out.println(sum);
    }
}
