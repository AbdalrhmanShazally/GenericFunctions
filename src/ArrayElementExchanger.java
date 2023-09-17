public class ArrayElementExchanger {
    public static <T> void exchangeElements(T[] array,int index1,int index2){
        if(index1 < 0 || index2 > array.length || index1 > array.length || index2 < 0)
            throw new IllegalArgumentException("Invalid indices");

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
