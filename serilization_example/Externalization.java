package serilization_example;

import java.io.*;

public class Externalization
{
    public static  void main(String a[]){
        Person_External person =
                new Person_External("Vardhan",20,"vardhan@gmail.com");
        Person_External person1 =
                new Person_External("Revanth",23,"revanth@gmail.com");

        try {
            //writing the object
            FileOutputStream fos = new FileOutputStream("Person_External.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
            oos.writeObject(person1);
            System.out.println("Serilization sucesss!");

            // reading the file
            FileInputStream fis = new FileInputStream("Person_External.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            person = (Person_External) ois.readObject();
            person1 = (Person_External) ois.readObject();
            System.out.println("Deserilization successful!");
            System.out.println(person);
            System.out.println(person1);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
