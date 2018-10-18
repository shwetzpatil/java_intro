import java.util.ArrayList;
import java.util.Arrays;
class ArraysTest {
    // can you remember how to set up your main function?
    public static void main(String[] args) {
    // declare an asrray of Strings and print it
    String[] arrStr = new String[] {"a","b","c"};
    System.out.println(Arrays.toString(arrStr));
    // declare an array of integers and print it
    int[] arrInt = new int[] {1,2,3};
    System.out.println(Arrays.toString(arrInt));
    // declare an ArrayList of integers, add numbers to it, and then print it
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList());
    list.add(3);
    System.out.println(list); 
  }
}