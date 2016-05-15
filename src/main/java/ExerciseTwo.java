import java.beans.Statement;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExerciseTwo {
    public static void main(String[] args) throws IOException {
        File file = new File("exerciseTwo.txt");

        writer(file);
        String out = reader(file);
        System.out.println(out);

    }

    private static void writer (File file) throws IOException {

        try(FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < 100; i++){
                int b = (int) (Math.random() * 10);
                writer.write(Integer.toString(b));
            }

            writer.flush();
            writer.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static String reader(File file) throws IOException {

        FileReader reader = new FileReader(file);
        String str = "";
        int symbol;
        while((symbol = reader.read()) != -1) {
            str += (char) symbol;
        }
        return str;
    }

    public List<Integer> list () {
        List list = new ArrayList<>();
        return list;
    }
}



