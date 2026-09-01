package WhileLoop2;

public class Q2 {
    public static void main(String[] args) {
        int start=Integer.parseInt(IO.readln("Enter the no to start calculating sum from: "));
        int end=Integer.parseInt(IO.readln("Enter the no till where you want the sum: "));
        System.out.println("Sum of natural numbers from "+start+" to "+end+" is: "+getsum(start,end));
    }
    public static int getsum(int start,int end){
        int sum=0;
        while (start<=end) {
            sum+=start;
            start++;
        }
        return sum;
    }
}
