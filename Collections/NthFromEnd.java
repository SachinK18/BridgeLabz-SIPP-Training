import java.util.*;

public class NthFromEnd {
    
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        if (list.isEmpty() || n <= 0) {
            return null;
        }
        
        Iterator<T> first = list.iterator();
        Iterator<T> second = list.iterator();
        
        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) {
                return null;
            }
            first.next();
        }
        
        while (first.hasNext()) {
            first.next();
            second.next();
        }
        
        return second.next();
    }
    
    public static void main(String[] args) {
        LinkedList<Character> letters = new LinkedList<>();
        letters.add('A');
        letters.add('B');
        letters.add('C');
        letters.add('D');
        letters.add('E');
        
        System.out.println("LinkedList: " + letters);
        
        int position = 2;
        Character result = findNthFromEnd(letters, position);
        
        System.out.println(position + "nd element from end: " + result);
        
        position = 1;
        result = findNthFromEnd(letters, position);
        System.out.println(position + "st element from end: " + result);
        
        position = 5;
        result = findNthFromEnd(letters, position);
        System.out.println(position + "th element from end: " + result);
    }
}
