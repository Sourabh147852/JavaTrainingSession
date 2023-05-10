public class Person {

    String name = null;
    int age = 0;

    public Person(int a, String n) {
        this.age = a;
        this.name = n;

    }

    public Person(String b1) {
        this.name = b1;
    }

    public void PersonDetails() {
        System.out.println("Person Name is " + name + " and age" + age);
    }


}
