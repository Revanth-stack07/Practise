import java.util.*;

public class ExceptionSample {
    static int B,H;
    public static void area(int a, int b) throws Exception{
            if ((a<=0) || (b<=0)){
                throw new Exception(":Breadth and height must be positive");
            }
            else
              System.out.println("Area of a rectangle is: "+ a*b);
    }

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */ 
        Scanner in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();
        ExceptionSample.area(B,H);             
    }
}