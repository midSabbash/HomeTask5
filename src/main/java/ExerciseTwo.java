import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class ExerciseTwo {
    public static void main(String[] args) throws IOException {
        File file = new File("exerciseTwo.txt");

        writer(file);
        reader();
        token();
    }

    private static void writer (File file) throws IOException {
        try(FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < 100; i++){
                int b = (int) (Math.random() * 100);
                writer.write(Integer.toString(b) + " ");
            }
            writer.flush();
            writer.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static String reader() throws IOException {
        File file = new File("exerciseTwo.txt");
        FileReader reader = new FileReader(file);
        String str = "";
        int symbol;
        while((symbol = reader.read()) != -1) {
            str += (char) symbol;
        }
        return str;
    }

    private static void token() throws IOException {
        String s = reader();
        StringTokenizer st;
        st = new StringTokenizer(s," ");
        List<Integer> numbers = new ArrayList<>();
        while(st.hasMoreTokens()){
            numbers.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(numbers);
        System.out.println(numbers);

        Writer writer = null;
        try {
            writer = new FileWriter("Finished.txt");
            for (Integer number : numbers) {
                writer.write(Integer.toString(number));
                writer.write(System.getProperty("line.separator"));
            }
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}