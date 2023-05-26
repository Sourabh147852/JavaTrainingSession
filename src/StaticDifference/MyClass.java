package StaticDifference;

public class MyClass {
    static int staticVariable = 10;
    int instanceVariable;

    static class YourClass{
        int name;
    }
        public static void main (String[]args){
            System.out.println(MyClass.staticVariable); // Accessing static variable without creating ainstance
            MyClass obj1 = new MyClass();
            MyClass obj2 = new MyClass();
            obj1.instanceVariable = 20;
            obj2.instanceVariable = 30;
            System.out.println(obj1.instanceVariable); // Accessing instance variable through an object
            System.out.println(obj2.instanceVariable); // Accessing instance variable through another object


        }
    }
