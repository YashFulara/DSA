package WhileLoop3;

public class Q046_StepsToZero {
    public static void main(String[] args) {
        int num1=Integer.parseInt(IO.readln("Enter the first no"));
        int num2=Integer.parseInt(IO.readln("Enter the second no. "));
        System.out.println(countOperations(num1, num2));
    }
 public static int countOperations(int num1, int num2) {
        int step=0;
        while(num1*num2!=0){
            if(num1>=num2){
                num1-=num2;
                step++;
            }else{
                num2-=num1;
                step++;
            }
        }
        return step;
    }
}
