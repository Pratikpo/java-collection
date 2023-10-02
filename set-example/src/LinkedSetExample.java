import java.util.LinkedHashSet;
import java.util.Set;
//Insertion order is manintained

public class LinkedSetExample {
    public static void main(String[] args) {
        Set<String> fruitName = new LinkedHashSet<>();
        fruitName.add("Apple");
        fruitName.add("Banana");
        fruitName.add("Mango");
        fruitName.add("jackfruit");
        fruitName.add("DragonFruit");
        for(String Fruit:fruitName){
            System.out.println("Name= "+Fruit);
        }
        System.out.println("-------------------------");
        fruitName.forEach(item-> System.out.println("Name: "+item));

    }
}
