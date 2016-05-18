import java.io.*;
import java.util.StringTokenizer;

public class ExerciseOne {

    private File file;
    private String str;

    public ExerciseOne(File file) {
        this.file = file;
        str = "";
    }

    public static void main(String[] args) throws IOException {

        ExerciseOne file = new ExerciseOne (new File("exerciseOne.txt"));

        file.reader();
        file.upperCase();
        System.out.println(file.str);


    }

    public void reader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        int symbol;
        while((symbol = bufferedReader.read()) != -1) {
            str += (char) symbol;
        }
        bufferedReader.close();
        str=str.trim();
    }

    public void upperCase() {
        StringTokenizer token = new StringTokenizer(str);
        StringBuilder builder = new StringBuilder();

        while(token.hasMoreTokens()){
            String word = token.nextToken();

            if(word.length() > 2){
                builder.append(word.toUpperCase()).append(" ");
            } else{
                builder.append(word).append(" ");
            }
        }
        str = builder.toString();
    }
}