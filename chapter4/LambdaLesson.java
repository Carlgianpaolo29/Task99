package chapter4;
import java.util.*;
public class LambdaLesson {
    
    private static String speciesName;
    private static boolean hopper;
    private static boolean swimmer;
    static void print(List<Animal> animals,CheckTrait checker){
        for(Animal animal: animals){
            if( checker.test(animal)){
                System.out.print(animal+", ");
            }
        }
        System.out.println(x:"*************");
    }
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal(speciesName: "Fish", hopper:false, swimmer:true));
        animals.add(new Animal(speciesName: "Kangaroo", hopper:true, swimmer:false));
        animals.add(new Animal(speciesName: "Rabbit", hopper:true, swimmer:false));
        animals.add(new Animal(speciesName: "Turtle", hopper:false, swimmer:true));
        print(animals, new CheckIfHopper());
        print(animals, new CheckIfHopper());
    }
}

class Animal{
    private String species;
    private boolean canHop;
    private boolean canSwim;
    public Animal(String speciesName,boolean hopper,boolean swimmer){
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;

    }
    public boolean canHop(){ return canHop;}
    public boolean canSwim(){ return canSwim;}
    public String toString(){ return species;}
}

interface CheckTrait{
    boolean test(Animal a);
}
class CheckIfHopper implements CheckTrait{
    public boolean test(Animal a){
        return a.canHop();

     }

}