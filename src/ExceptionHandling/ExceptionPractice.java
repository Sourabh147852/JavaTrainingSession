package ExceptionHandling;

    public class ExceptionPractice{
        public static void main(String[] args) {

            try{
                int a = 1 / 0;
                System.out.println(a);
            }catch(Exception abc){
                System.out.println("Hello");
            }
        }
    }
