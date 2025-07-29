import java.util.*;

public class RotateList {
    
    public static void rotateLeft(List<Integer> numbers, int positions) {
        if (numbers.isEmpty() || positions <= 0) {
            return;
        }
        
        int size = numbers.size();
        positions = positions % size;
        
        List<Integer> temp = new ArrayList<>();
        
        for (int i = positions; i < size; i++) {
            temp.add(numbers.get(i));
        }
        
        for (int i = 0; i < positions; i++) {
            temp.add(numbers.get(i));
        }
        
        numbers.clear();
        numbers.addAll(temp);
    }
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        System.out.println("Original list: " + numbers);
        
        int rotateBy = 2;
        rotateLeft(numbers, rotateBy);
        
        System.out.println("After rotating by " + rotateBy + " positions: " + numbers);
    }
}
