import java.util.LinkedList;
import java.util.List;


public class JavaLinkedListExample {
    public static void main(String[] args) {
        List<String> guestlist=new LinkedList<>();
        guestlist.add("pratik");
        guestlist.add("kedar");
        guestlist.add("karan");
        guestlist.add("vivek");
        for (String name : guestlist){
            System.out.println(name);
        }
        System.out.println("-----------------");
        guestlist.forEach(System.out::println);
        System.out.println("----------------");
        guestlist.add(0,"shreya");
        guestlist.forEach(System.out::println);
        System.out.println("-------------------");
        guestlist.add(2,"pratik");
        guestlist.forEach(System.out::println);
        System.out.println("----------------");
        guestlist.remove(0);
        guestlist.forEach(System.out::println);
        System.out.println("----------------");
        guestlist.remove(2);
        guestlist.forEach(System.out::println);
        System.out.println("----------------");


    }
}
