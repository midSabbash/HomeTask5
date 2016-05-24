import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Exercise2Test {

    private Exercise2 file = new Exercise2(new File("Test2.txt"));

    @Test(alwaysRun = true)
    public void writerTest () throws IOException {
        file.writer();
    }

    @Test
    public void readerTest () throws IOException {
        file.writer();
        file.reader();
        boolean sort = true;
        int i = 0;
        while (i < file.numbers.size()) {
            if(file.numbers.get(i)>file.numbers.get(i+1))
                sort = false;
            ++i;
            break;
        }
        Assert.assertTrue(sort);
    }

    @Test(alwaysRun = true)
    public void writeSortTest () throws IOException {
        file.writeSort();
    }
}
