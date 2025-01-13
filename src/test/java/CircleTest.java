import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CircleTest {

    @Test
    public void testCircleNormal() {
        //Set input
        String inputData = "5.45\n";
        ByteArrayInputStream inputTest = new ByteArrayInputStream(inputData.getBytes());
        System.setIn(inputTest);

        //Set output so we can retrieve it
        ByteArrayOutputStream outTest = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outTest));

        Main.main(new String[0]);

        String outputTest = "Enter radius: \n";
        outputTest += "Circumference: 34.2434\n";
        outputTest += "Area: 93.3132\n";

        Assertions.assertEquals(outputTest, outTest.toString());
    }

    @Test
    public void testCircleZero() {
        //Set input
        String inputData = "0\n";
        ByteArrayInputStream inputTest = new ByteArrayInputStream(inputData.getBytes());
        System.setIn(inputTest);

        //Set output so we can retrieve it
        ByteArrayOutputStream outTest = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outTest));

        Main.main(new String[0]);

        String outputTest = "Enter radius: \n";
        outputTest += "Circumference: 0.0000\n";
        outputTest += "Area: 0.0000\n";

        Assertions.assertEquals(outputTest, outTest.toString());
    }

    @Test
    public void testCircleNegative() {
        //Set input
        String inputData = "-1\n";
        ByteArrayInputStream inputTest = new ByteArrayInputStream(inputData.getBytes());
        System.setIn(inputTest);

        //Set output so we can retrieve it
        ByteArrayOutputStream outTest = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outTest));

        Main.main(new String[0]);

        String outputTest = "Enter radius: \n";
        outputTest += "Circumference: Radius must be positive\n";
        outputTest += "Area: Radius must be positive\n";

        Assertions.assertEquals(outputTest, outTest.toString());
    }
}
