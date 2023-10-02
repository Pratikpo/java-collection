import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> fruitNames = new TreeSet<>();
        fruitNames.add("Mango");
        fruitNames.add("Apple");
        fruitNames.add("Guava");
        fruitNames.add("Orange");
        for(String Fruit:fruitNames){
            System.out.println("Name= "+Fruit);
        }

    }
}
