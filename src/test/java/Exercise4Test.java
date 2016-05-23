import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.*;

public class Exercise4Test {

    @Test
    public void filterTest () throws IOException {
        FileReader readMails = new FileReader("mails.txt");
        FileReader readGroups = new FileReader("groups.txt");
        FileWriter writeUsers = new FileWriter("users.txt");

        Exercise4.filter(readGroups,readMails,writeUsers);

        BufferedReader bufferedReader = new BufferedReader(new FileReader("users.txt"));

        boolean test = true;
        String user;
        while((user = bufferedReader.readLine())!= null)if(user.split(";").length!=3)test = false;
        Assert.assertTrue(test);
    }
}
