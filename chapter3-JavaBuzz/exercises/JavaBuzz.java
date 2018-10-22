public class JavaBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            String result = "";
            if (i % 3 == 0) { // If divisible by 3
                result += "Java";
            }
            if (i % 5 == 0) { // If divisible by 5
                result += "Buzz";
            }
            // If it was divisible by either 3 or 5 (or both), print Fizz, Buzz, or FizzBuzz accordingly.
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(result);
            } else { // Or else just print the integer
                System.out.println(i);
            }
        }
    }

}