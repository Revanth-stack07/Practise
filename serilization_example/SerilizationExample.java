package serilization_example;
import java.io.*;


class SerilizationExample {
     public static  void main(String a[]){
         Person person =
                 new Person("Vardhan",20,"vardhan@gmail.com");
         Person person1 =
                 new Person("Revanth",23,"revanth@gmail.com");
         System.out.println(person);


         try {
             //writing the object
             FileOutputStream fos = new FileOutputStream("person.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             oos.writeObject(person);
             oos.writeObject(person1);
             System.out.println("Serilization sucesss!");
               // reading the file
             FileInputStream fis = new FileInputStream("person.txt");
             ObjectInputStream ois = new ObjectInputStream(fis);
             person = (Person) ois.readObject();
             person1 = (Person) ois.readObject();
             System.out.println("Deserilization successful!");
             System.out.println(person);
             System.out.println(person1);
         } catch (IOException | ClassNotFoundException e) {
             throw new RuntimeException(e);
         }
     }
}
