import static org.junit.Assert.*;
import org.junit.Test;

public class JavaBuzzTest {

    @Test
    public void checkBuzz() {
        String answer = JavaBuzz.check(5);
        assertEquals(answer, "Buzz");
    }

    @Test
    public void checkJava() {
        String answer = JavaBuzz.check(9);
        assertEquals(answer, "Java");
    }

    @Test
    public void checkJavaBuzz() {
        String answer2 = JavaBuzz.check(15);
        assertEquals(answer2, "JavaBuzz");
    }

    @Test
    public void checkNumber() {
        String answer3 = JavaBuzz.check(16);
        assertEquals(answer3, "16");
    }

}
/*Compile the test:
javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar JavaBuzzTest.java
 Run the test:
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore JavaBuzzTest
*/