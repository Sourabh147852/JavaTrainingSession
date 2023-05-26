package Implements;

public class Person implements Employee,Salaried{

        String name;
        float salary;
        public Person(String name, float salary){
            this.name=name;
            this.salary=salary;
        }
    @Override
    public String getname() {
        return this.name;
    }

    @Override
    public float getsalary() {
        return this.salary;
    }
}
