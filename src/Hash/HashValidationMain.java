package Hash;

public class HashValidationMain {
    public static void main(String[] args) {


        HashValidation emp = new HashValidation("Sourabh", 34);
        HashValidation emp1 = new HashValidation("Sourabh", 34);
        HashValidation emp2 = new HashValidation("Eourabh", 33);

        System.out.println(emp);
      ;
//        System.out.println(emp1.name.hashCode());
//        System.out.println(emp2.name.hashCode());
    }
}