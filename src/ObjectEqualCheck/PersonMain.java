package ObjectEqualCheck;

import org.w3c.dom.ls.LSOutput;

public class PersonMain {
    public static void main(String[] args) {
        Person obj= new Person("Sourabh", 27);
        Person obj1= new Person("Sourabh", 27);
        System.out.println(obj);
    }

}
