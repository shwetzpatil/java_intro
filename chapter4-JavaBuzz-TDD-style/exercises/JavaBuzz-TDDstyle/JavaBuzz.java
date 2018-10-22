public class JavaBuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            System.out.println(check(i));
        }
    }

    public static String check (int i) {
        if (i % 15 == 0) {
            return "JavaBuzz";
        } else if (i % 3 == 0) {
            return "Java";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(i);
        }
    }
}

/* compile
javac JavaBuzz.java
run
java JavaBuzz
*/