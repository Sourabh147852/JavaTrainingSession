package Collection.Assignment;

import Collection.ListArray;

import java.util.ArrayList;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Sourabh", 27);
        Person p2 = new Person("Sunil", 28);
        Person p3 = new Person("Surendra", 29);
        Person p4 = new Person("Aman", 30);
        Person p5 = new Person("Gaurav", 31);
        Person p6 = new Person("Mohit", 32);
        Person p7 = new Person("Atul", 33);
        Person p8 = new Person("Akshay", 34);
        Person p9 = new Person("Shital", 35);
        Person p10 = new Person("Karan", 36);

        ArrayList<Person> listArray = new ArrayList<>();
        System.out.println(listArray.size());
        listArray.add(p1);
        listArray.add(p2);
        listArray.add(p3);
        listArray.add(p4);
        listArray.add(p5);
        listArray.add(p6);
        listArray.add(p7);
        listArray.add(p8);
        listArray.add(p9);
        listArray.add(p10);
        System.out.println(listArray.size());
        System.out.println(listArray);
        //Create another list and add person objects whose name stars with S
        ArrayList<Person> listArray0 = new ArrayList<>();
        // Loop over the original list and add Person objects whose name starts with 'S'

        for (Person list : listArray) {
           if (list.getPerson().startsWith("S")) {
                listArray0.add(list);
            }
       }

            // Print the both list
        System.out.println("Original List:");
        for (Person person : listArray) {
            System.out.println("Name: " + person.getPerson() + ", Age: " + person.getAge());
        }

        System.out.println("\nFiltered List (Names starting with 'S'):");
        for (Person person : listArray0) {
            System.out.println("Name: " + person.getClass() + ", Age: " + person.getAge());
        }




//        //To.Array Method used here
//
//        Person2 a1 = new Person2("Jaipur");
//        Person2 a2 = new Person2("Kota");
//        Person2 a3 = new Person2("Ajmer");
//
//        ArrayList<Person2> listArray1 = new ArrayList<>();
//        listArray1.add(a1);
//        listArray1.add(a2);
//        listArray1.add(a3);
//        System.out.println("ArrayList"+listArray1);
//        // Convert ArrayList to an array
//        Person2[] array = listArray1.toArray(new Person2[listArray1.size()]);
//
//        // Print the elements of the array
//        for (Person2 element : array) {
//            System.out.println("For Loop"+element);
//        }
//        System.out.println("Array"+array);







    }
}
