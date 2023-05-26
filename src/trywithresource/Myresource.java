//package trywithresource;
//
//public class Myresource implements AutoCloseable{
//    public Myresource() {
//        System.out.println("Intializing Resource");
//    }
//
//    public void readingDataFromResouce()
//        throws ResourceNotAvailableExecption{
//        System.out.println("Reading Data"+"From Resource");
//        ResourceNotAvailableExecption e= new ResourceNotAvailableExecption("Resource");
//        throw e;
//        }
//
//      public void closingResource(){
//          System.out.println("Closing Resource");
//    }
//
//    @Override
//    public void close() throws Exception {
//    closingResource();
//    }
//}
