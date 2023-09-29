import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Long,String> myPhonebook= new TreeMap<>();
        myPhonebook.put(9552930270L,"pratik");
        myPhonebook.put(95342930270L,"kedar");
        myPhonebook.put(9554930270L,"karan");
        myPhonebook.put(9422930270L,"siddhesh");
        myPhonebook.put(9553530270L,"pranav");
        System.out.println(myPhonebook);
        for (Map.Entry<Long,String>entry:myPhonebook.entrySet()){
            System.out.println("k="+entry.getKey()+"v="+entry.getValue());
        }
    }
}
