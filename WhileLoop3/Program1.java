package WhileLoop3;

import java.util.Stack;



public class Program1 {
    public static void main(String[] args) {
        String s=IO.readln("Enter any String with combination of ( and ) in it:");
        System.out.println(test(s));
    }
    public static String test(String s){
        Stack<StringBuilder> stack=new Stack<>();
        StringBuilder current=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if (c=='(') {
                stack.push(current);
                current=new StringBuilder();
            }
            else if (c==')') {
                StringBuilder previous=new StringBuilder();
                previous=stack.pop();
                previous.append(current.reverse());
                current=previous;
            }
            else{
                current.append(c);
            }
            
        }
        return current.toString();

    }
    
}
