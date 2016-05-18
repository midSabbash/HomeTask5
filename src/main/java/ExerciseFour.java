import java.io.*;

public class ExerciseFour {
    public static void main(String[] args) throws IOException {

        FileReader readMails = new FileReader("mails.txt");
        FileReader readGroups = new FileReader("groups.txt");
        FileWriter writeUsers = new FileWriter("users.txt");

        filter(readMails, readGroups, writeUsers);

        readMails.close();
        readGroups.close();
        writeUsers.close();
    }

    private static void filter(Reader mails, Reader groups, Writer users) throws IOException {

        BufferedReader readMails = new BufferedReader(mails);
        BufferedReader readGroups = new BufferedReader(groups);
        BufferedWriter writerUsers = new BufferedWriter(users);

        String mail = readMails.readLine();
        String group = readGroups.readLine();


        while (mail != null && group != null) {
            if (!mail.contains("#") && !group.contains("#")) {
                writerUsers.write(mail + ";" + group.split(";")[1] + "\n");
            }
            mail = readMails.readLine();
            group = readGroups.readLine();
        }
        writerUsers.flush();
        writerUsers.close();
    }
}
