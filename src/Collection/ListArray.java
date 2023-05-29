package Collection;

import Interfacce.Person;

import java.util.ArrayList;

public class ListArray {
    public static void main(String[] args) {
        //<String>indicates that String object  will be added to ArratList,its part of java generic
//        ArrayList<String> arraylist= new ArrayList<>();
//        arraylist.add("Sourabh");
//        arraylist.add("SOurabh-1");
//        arraylist.add("Sourabh-2");
//
//        String firstElement=arraylist.get(0);
//
//        String ThirdElement=arraylist.get(2);
//
//        arraylist.add(1, "Mohit-1");
//        String SecondElement=arraylist.get(1);
//        System.out.println(SecondElement);

        ArrayList<Person>arrperson= new ArrayList<>();

        Person p1= new Person("Sourabh ",23);
        Person p2= new Person("Aman",25);
        Person p3= new Person("Gaurav ",28);

        arrperson.add(p1);
        arrperson.add(p2);
        System.out.println("Size of Array "+arrperson.size());
        Person arrayatzero= arrperson.get(0);
        arrperson.add(0, p3);
        arrayatzero= arrperson.get(0);
        System.out.println(arrayatzero);




    }
}
