import static org.junit.Assert.*;
import org.junit.*;



public class JavaBuzzTest {

    @Test
    public void forThree(){
        JavaBuzz buzz = new JavaBuzz();
        String answer = buzz.javaBuzz(3);
        assertEquals(answer, "Java");
    }

    @Test
    public void forFive(){
        JavaBuzz buzz = new JavaBuzz();
        String answer = buzz.javaBuzz(5);
        assertEquals(answer, "Buzz");
    }

    @Test
    public void forFifteen(){
        JavaBuzz buzz = new JavaBuzz();
        String answer = buzz.javaBuzz(15);
        assertEquals(answer, "JavaBuzz");
    }

    @Test
    public void forEveryoneElse(){
        JavaBuzz buzz = new JavaBuzz();
        String answer = buzz.javaBuzz(13);
        assertEquals(answer, "13");
    }
}
/*Compile the test:
javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar JavaBuzzTest.java
 Run the test:
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore JavaBuzzTest
*/