package Collection.Assignment;

public class Person {
    String person = null;
    int age = 0;


    public Person(String person, int age) {
        this.person = person;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "person='" + person + '\'' +
                ", age=" + age +
                '}';
    }



    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public int getAge() {
        return age;
    }
}

