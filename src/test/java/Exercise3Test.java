import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Exercise3Test {

    @Test
    public void findDoubleTest () throws IOException {
        Exercise3 et = new Exercise3(new File("exerciseThree.txt"));
        et.findDouble();
        ArrayList <Object> array = new ArrayList<>();
        array.add(48.48);
        array.add(.98);
        array.add(-1.0);
        array.add(-.666);
        Assert.assertEquals(array,et.getArray());
    }

    @Test
    public void findIntTest () throws IOException {
        Exercise3 et = new Exercise3(new File("exerciseThree.txt"));
        et.findInteger();
        ArrayList<Object> array = new ArrayList<>();
        array.add(432);
        array.add(-89);
        array.add(7777);
        Assert.assertEquals(array, et.getArray());
    }

    @Test
    public void findCharTest () throws IOException {
        Exercise3 et = new Exercise3(new File("exerciseThree.txt"));
        et.findChar();
        ArrayList<Object> array = new ArrayList<>();
        array.add("a");
        array.add("Ы");
        array.add("Я");
        array.add("B");
        array.add("b");
        array.add("C");
        Assert.assertEquals(array, et.getArray());
    }

    @Test
    public void findStringTest () throws IOException {
        Exercise3 et = new Exercise3(new File("exerciseThree.txt"));
        et.findString();
        ArrayList<Object> array = new ArrayList<>();
        array.add("bod");
        array.add("-too,");
        array.add("for");
        array.add("Demacia");
        array.add("now");
        array.add("and");
        array.add("FOREVER!");
        array.add("@Gmail.com");
        Assert.assertEquals(array, et.getArray());
    }
}
