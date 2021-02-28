import java.text.Collator;
import java.util.*;

public class Main {


    public static void main(String[] args) {


        List<Animals> animals1 = new ArrayList<>();
        List<Animals> animals2 = new ArrayList<>();

        animals1.add(new Cat(3, 10, "persid cat", "Mar"));
        animals1.add(new Cat(5, 15, "sphinx cat", "Mursic"));
        animals1.add(new Cat(7, 11, "persian cat", "Vally"));
        animals1.add(new Cat(3, 10, "siamese cat", "Norry"));
        animals1.add(new Dog(10, 20, "Boxer", "Box"));
        animals1.add(new Dog(8, 25, "Labrador", "Ax"));
        animals1.add(new Dog(4, 13, "Poodle", "Sam"));
        animals1.add(new Dog(11, 35, "Bulldog", "Baks"));

        animals2.addAll(animals1);

        Collections.sort(animals1);
        System.out.println(animals1);



        Comparator<Animals> Age  = new Comparator<Animals>() {
            @Override
            public int compare(Animals o1, Animals o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        animals2.sort(Age);
        System.out.println(animals2);
    }

    }





