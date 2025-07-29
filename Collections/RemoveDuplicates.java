import java.util.*;

public class RemoveDuplicates {
    
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        
        for (Integer num : numbers) {
            if (!seen.contains(num)) {
                seen.add(num);
                result.add(num);
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        
        System.out.println("Original list: " + numbers);
        
        List<Integer> unique = removeDuplicates(numbers);
        System.out.println("After removing duplicates: " + unique);
    }
}
