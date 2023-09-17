import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //Example usage with odd Integers:
        Collection<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        Predicate<Integer> isOdd = n -> n%2 !=0;

        int oddCount = CollectionPropertyCounter.countElementsWithProperty(numbers,isOdd);
        System.out.println("Count of odd numbers:" + oddCount);

        //Example usage with palindromes (strings):
        Collection<String> words = List.of("Level","hello","world","deified");
        Predicate<String> isPlaindroms = s -> isPlaindrome(s);

        int plaindromeCount = CollectionPropertyCounter.countElementsWithProperty(words,isPlaindroms);
        System.out.println("Count of plaindromes:" + plaindromeCount);

    }

    private static boolean isPlaindrome(String s) {
        String clean = s.replaceAll("\\s+","").toLowerCase();
        int length = clean.length();
        for (int i = 0; i < length; i++){
            if(clean.charAt(i) != clean.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}