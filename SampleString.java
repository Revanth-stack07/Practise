public class SampleString{
    public static void main(String a[]){
    String str1 = "Revanth   ";
    String new_str = str1.trim();
    System.out.println(new_str.startsWith("Rev"));
    System.out.println(new_str.endsWith("anth"));
    System.out.println("Substring :" + str1.substring(2));
    System.out.println(new_str);
    }
}