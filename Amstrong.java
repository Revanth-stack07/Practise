import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        for (int index = 0; index < 1000; index++) {
            if(isAmstrong(index)){
                System.out.println(index + " :is an Amstrong number");
            }
        }

    }
    static boolean isAmstrong(int a){
        if(a<=1){
            return false;
        }
        int amstrong = 0;
        int original = a;
         while (a>=1) {
            int  c = a%10; //reminder gives the last number in the given value - 3
             amstrong += c*c*c;
             a = a/10;  // this removes the last number 
         }
        return amstrong == original;

    }
}