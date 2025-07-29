import java.util.*;

public class FrequencyCounter {
    
    public static Map<String, Integer> countFrequency(List<String> words) {
        Map<String, Integer> frequency = new HashMap<>();
        
        for (String word : words) {
            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1);
            } else {
                frequency.put(word, 1);
            }
        }
        
        return frequency;
    }
    
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        
        System.out.println("Input list: " + fruits);
        
        Map<String, Integer> result = countFrequency(fruits);
        System.out.println("Frequency count: " + result);
    }
}
