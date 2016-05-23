import java.io.*;
import java.util.StringTokenizer;

public class Exercise1 {

    private File file;
    private String str;

    Exercise1(File file) {
        this.file = file;
        str = "";
    }

    public static void main(String[] args) throws IOException {

        Exercise1 file = new Exercise1(new File("exerciseOne.txt"));

        file.reader();
        file.upperCase();
        System.out.println(file.str);
    }

    String reader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        int symbol;
        while((symbol = bufferedReader.read()) != -1) {
            str += (char) symbol;
        }
        bufferedReader.close();
        str=str.trim();
        return str;
    }

    String upperCase() {
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
        str = builder.toString().trim();
        return str;
    }
}