package serilization_example;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Person_External implements Externalizable {
    private String name;
    private int age;
    private String email;

    public Person_External(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Person_External() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

  // Externalizable provides full control to the programmer over serializing the variables.
  // No need of mentioning the transient key word when implemented Externalizable.
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name); // writeObect() method is used to write String values.
        out.writeInt(age);
        out.writeObject(email);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
      name = (String)in.readObject(); // typecasting the object to String type
      age = in.readInt();
      email = (String)in.readObject();
    }
}
