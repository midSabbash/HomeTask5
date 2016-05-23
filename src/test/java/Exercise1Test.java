import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Exercise1Test {

    private Exercise1 file = new Exercise1(new File("Test.txt"));

    @Test
    public void readerTest () throws IOException {
        Assert.assertEquals(file.reader(), "Test, test, te st testing t.");
    }

    @Test
    public void upperTest () throws IOException {
        Assert.assertTrue(file.reader().equalsIgnoreCase(file.upperCase()));
    }
}
