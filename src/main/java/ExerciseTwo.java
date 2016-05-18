import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.io.File;


public class ExerciseTwo {

    private File file;
    private String str;
    private ArrayList<Integer> numbers;

    public ExerciseTwo(File file) {
        this.file = file;
        str = "";
        numbers = new ArrayList<>();
    }

    public static void main(String[] args) throws IOException {
        ExerciseTwo file = new ExerciseTwo (new File("exerciseTwo.txt"));

        file.writer();
        file.reader();
        file.writeSort();
    }

    public void writer() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < 100; i++){
                int b = (int) (Math.random() * 100 +1);
                writer.write(Integer.toString(b) + " ");
            }
            writer.flush();
            writer.close();
    }

    public void reader() throws IOException {

        FileReader reader = new FileReader(file);
        int symbol;
        while((symbol = reader.read()) != -1) str += (char) symbol;

        StringTokenizer st;
        st = new StringTokenizer(str," ");

        while(st.hasMoreTokens()) numbers.add(Integer.parseInt(st.nextToken()));
        Collections.sort(numbers);
    }

    public void writeSort() throws IOException {
        Writer writer = new FileWriter(file);
        for (Integer number : numbers) writer.write(Integer.toString(number) + System.getProperty("line.separator"));

        writer.flush();
        writer.close();
    }
}