class Loops{
    public static void main (String a[]){
        int i = 1;
        //while loop
        while(i<5){
            System.out.println("Hi " + i);
            int j=1;
            while(j<=3){
                System.out.println("Hello");
                j++;
            }
            i++;
        }

        //do while
         do{
            System.out.println("do While " + i);
            i++;
         }while(i<=5);

    }
}