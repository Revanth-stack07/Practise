public class Patterns{
    public static void main(String[] args) {
    pattern2(5);
    }

    static void pattern1(int n ){
      for (int row = 1; row < n *2; row++) 
      {
            int t = row>n ? 2*n-row: row;
            for(int j=0; j<t; j++){
                System.out.print(row+j);
            }
            System.out.println();
       }
        
    }

    static void pattern2(int n ){
        for (int row = 1; row <= n *2; row++) 
        {
            int t = row>n ? 2*n-row: row;
            for(int k =0; k<n-t;k++){
                System.out.print(" ");
            }
              for(int j=0; j<t; j++){
                  System.out.print(" *");
              }
              System.out.println();
         }
          
      }
}