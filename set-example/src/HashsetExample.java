import java.util.HashSet;
import java.util.Set;
//Insertion order is not maintained

public class HashsetExample {
    public static void main(String[] args) {
        Set<String> fruitName = new HashSet<>();

        fruitName.add("Apple");
        fruitName.add("Banana");
        fruitName.add("Mango");
        fruitName.add("jackfruit");
        fruitName.add("DragonFruit");
        System.out.println("----------------------------");
        System.out.println("is set Empty  "+fruitName.isEmpty());
        System.out.println("----------------------------");
        for(String FruitName:fruitName){
            System.out.println("Name="+FruitName);
        }
        System.out.println("-----------------------------");
        fruitName.remove("Mango");
       for (String FruitName:fruitName){
           System.out.println("Name="+FruitName);
       }
        System.out.println("------------------------------");
       fruitName.forEach(item -> System.out.println("Name: "+item));
        System.out.println("------------------------------");
        System.out.println("Spze of the Set  "+fruitName.size());
        System.out.println("------------------------------");
    }
}
