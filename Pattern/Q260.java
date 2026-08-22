

class Q260{
    public static void main(String[] args) {
        int n=Integer.parseInt(IO.readln("Enter no of rows \n"));
        printPattern(n);
    }
    static void printPattern(int n){
       int num=n*(n+1)/2;
       int space=n-1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=space; j++) {
                System.out.printf("%3s","");
            }

           
            for (int j = 1; j <=i; j++) {
                if(i%2==1){//for odd row
                    System.out.printf("%3s",(char)(num+64));
                    num++;
                
                }else{//this is for even row
                    
                    System.out.printf("%3s",(char)(num+64));
                    num--;
                }
            }
            if (i%2==1) {
                num-=i+1;
            } else { 
                num-=i;
            }
            space--;
            System.out.println();
        }
    }
}