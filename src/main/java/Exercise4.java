import java.io.*;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        FileReader readMails = new FileReader("mails.txt");
        FileReader readGroups = new FileReader("groups.txt");
        FileWriter writeUsers = new FileWriter("users.txt");

        filter(readMails, readGroups, writeUsers);
    }

    static void filter(Reader mails, Reader groups, Writer users) throws IOException {
        String mail;
        String group;

        BufferedReader readMails = new BufferedReader(mails);
        BufferedReader readGroups = new BufferedReader(groups);
        BufferedWriter writerUsers = new BufferedWriter(users);

        while ((mail = readMails.readLine()) != null && (group = readGroups.readLine()) != null) {
            if (!mail.contains("#") && !group.contains("#")) {
                writerUsers.write(mail + ";" + group.split(";")[1] + "\n");
            }
        }
        writerUsers.flush();
        writerUsers.close();
        readGroups.close();
        readMails.close();
    }
}
