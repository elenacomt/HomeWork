public interface Biteable {

    public void  bite();


    default void jump () {

         System.out.println("I am bite you!");

    }
}
