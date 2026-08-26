package Recursion;
public class Q3 {
    public static void main(String[] args) {
        int n=Integer.parseInt(IO.readln("Enter the no to generate table till(10):"));
        getTable(n,1);
    }
    static int getTable(int n,int i){
        if (i<=10) {
        System.out.println(n+" X "+i+" = "+(n*i));
        return getTable(n,i+1);    
        }
        return 0;
        
    }
}
