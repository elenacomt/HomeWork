

public  class Dog extends Animals implements Biteable{

    private int Cat;

    public Dog(int age, int speedRunning, String breed, String name) {
        super(age, speedRunning, breed, name);
    }


    @Override
    public void eat() {
        System.out.println(getName() + " I need to eat");

    }

    @Override
    public void run() {
        System.out.println("I am running " + getSpeedRunning());
        super.run();
    }

    @Override
    public void myBreed() {
        System.out.println("My breed is " + getBreed());
        super.myBreed();
    }

    @Override
    public void bite() {
        if(Cat>1) {
            System.out.println("If cats more then one, i gone ");
        }else {
            bite();
        }


    }

    @Override
    public void jump() {
        System.out.println("I jumping high");

    }


}
