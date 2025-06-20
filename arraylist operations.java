import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Fruits: " + fruits);

        System.out.println("Size: " + fruits.size());
        System.out.println("Is list empty? " + fruits.isEmpty());
        System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));

        Object[] fruitArray = fruits.toArray();
        System.out.println("Array: " + Arrays.toString(fruitArray));

        List<String> moreFruits = Arrays.asList("Mango", "Papaya");
        fruits.addAll(moreFruits);
        System.out.println("After addAll: " + fruits);

        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        List<String> removeList = Arrays.asList("Mango", "Apple");
        fruits.removeAll(removeList);
        System.out.println("After removeAll: " + fruits);
    }
}
