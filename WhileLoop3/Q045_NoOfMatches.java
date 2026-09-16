package WhileLoop3;

public class Q045_NoOfMatches {
    public static void main(String[] args) {
        int n=Integer.parseInt(IO.readln("Enter the no of teams "));
        System.out.println(numberOfMatches(n));
    }
    public static int numberOfMatches(int n) {
        int match=0;
        
        while(n!=1){
            match+=n/2;
                n-=n/2;
        }
        return match;
        
    }
}

