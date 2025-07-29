import java.util.*;

public class ReverseList {
    
    public static void reverseArrayList(ArrayList<Integer> numbers) {
        int start = 0;
        int end = numbers.size() - 1;
        
        while (start < end) {
            Integer temp = numbers.get(start);
            numbers.set(start, numbers.get(end));
            numbers.set(end, temp);
            start++;
            end--;
        }
    }
    
    public static void reverseLinkedList(LinkedList<Integer> numbers) {
        int start = 0;
        int end = numbers.size() - 1;
        
        while (start < end) {
            Integer temp = numbers.get(start);
            numbers.set(start, numbers.get(end));
            numbers.set(end, temp);
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arrayNumbers = new ArrayList<>();
        arrayNumbers.add(1);
        arrayNumbers.add(2);
        arrayNumbers.add(3);
        arrayNumbers.add(4);
        arrayNumbers.add(5);
        
        System.out.println("Original ArrayList: " + arrayNumbers);
        reverseArrayList(arrayNumbers);
        System.out.println("Reversed ArrayList: " + arrayNumbers);
        
        LinkedList<Integer> linkedNumbers = new LinkedList<>();
        linkedNumbers.add(1);
        linkedNumbers.add(2);
        linkedNumbers.add(3);
        linkedNumbers.add(4);
        linkedNumbers.add(5);
        
        System.out.println("Original LinkedList: " + linkedNumbers);
        reverseLinkedList(linkedNumbers);
        System.out.println("Reversed LinkedList: " + linkedNumbers);
    }
}
