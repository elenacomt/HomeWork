public class Cat  extends  Animals  implements  Scratchable {

    private boolean angry;

    public Cat(int age, int speedRunning, String breed, String name) {
        super(age, speedRunning, breed, name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " i am eating fish");

    }

    @Override
    public void run() {
        System.out.println("I am" + getName() + "and i run " + getSpeedRunning() + "per hour");
        //super.run();
    }

    @Override
    public void myBreed() {
        System.out.println("My Briid is bengal cat");
        //super.myBreed( );
    }


    @Override
    public void scratch() {
        System.out.println(" i am a hunter");
    }


    @Override
    public void hunt() {
        if (angry == false) {
            System.out.println("I am gone");
        } else {
            hunt();
        }


    }


}