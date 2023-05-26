package Hash;

import java.util.Objects;

public class HashValidation {
    String name;
    int age=0;


    public HashValidation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashValidation that = (HashValidation) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "HashValidation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
