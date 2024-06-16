package serilization_example;
import java.io.Serializable;

public class Person implements Serializable {
        private String name;
        private int age;

        // if we use transient for a variable this will not be serialized.
        private transient String email;

        public Person(String name, int age, String email){
            this.name = name;
            this.age = age;
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
}
