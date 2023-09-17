import java.util.Arrays;
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
        Predicate<String> isPalindromes = Main::isPalindrome;

        int palindromeCount = CollectionPropertyCounter.countElementsWithProperty(words,isPalindromes);
        System.out.println("Count of palindromes:" + palindromeCount);


        //Example usage with Generic Array:
        int index1 = 1;
        int index2 = 3;

        Integer[] elements = {1, 2, 3, 4, 5};
        System.out.println("Original Array:"+ Arrays.toString(elements));
        ArrayElementExchanger.exchangeElements(elements,index1,index2);
        System.out.println("Array after swapping elements at indices "+ index1 + " and"+ index2 + " :"+ Arrays.toString(elements));


    }

    private static boolean isPalindrome(String s) {
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