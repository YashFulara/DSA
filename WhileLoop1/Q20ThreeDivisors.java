package WhileLoop1;
//LeetCode-1952
public class Q20ThreeDivisors {
    public static void main(String[] args) {
        int n=Integer.parseInt(IO.readln("Enter the no "));
        System.out.println("your number is special?"+isThree(n));;
    }
    public static boolean isThree(int n) {
    int count=0;
    int factor=1;
    while(factor<=n){
        if(n%factor==0){
            count++;
        }
        factor++;
  
    }
    if(count==3){
        return true;
    }else{
        return false;
    }
    

    }


}
