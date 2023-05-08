public class ArrayMinMaxSum {
    public static void main(String[] args) {

        int [] array= new int []{1,4,2,5,6,6};
        int sum=0;

        for (int i=0; i<array.length; i++){

            sum+=array[i];
        }
        System.out.println(sum);
    }
}
