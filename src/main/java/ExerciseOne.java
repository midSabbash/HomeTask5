import java.io.*;

public class ExerciseOne {
    public static void main(String[] args) throws IOException {

        String file = reader("exerciseOne.txt");
        String out = upperCase(file);
        System.out.println(out);
    }

    private static String reader(String file) throws IOException {
        FileReader reader = new FileReader(file);
        String str = "";
        int symbol;
        while((symbol = reader.read()) != -1) {
            str += (char) symbol;
        }

        str=str.trim();
        str=str.concat(",");
        str=str.replace(' ', ',');
        str=str.replace(':',',');
        return str;
    }

    private static String upperCase(String str) {
        String intactStr = "", strUp;
        int quantity;
        while (str.length() > 0) {
            quantity = str.indexOf(',');

            if(quantity > 2){
                strUp = str.substring(0, quantity);
                strUp = strUp.toUpperCase();
                intactStr = intactStr.concat(strUp + " ");

            }else
                intactStr = intactStr.concat(str.substring(0, quantity) + " ");
            str = str.substring(quantity +1);

        }
        return intactStr;
    }
}
