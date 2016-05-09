import java.io.*;

public class ExerciseOne {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");

        System.out.println(reader(file));
    }

    private static String reader(File file) throws IOException {
        FileReader reader = new FileReader(file);
        String str = "";
        int symbol;
        while((symbol = reader.read()) != -1) {
            str += (char) symbol;
        }
        str=str.trim();
        return str;
    }

}
