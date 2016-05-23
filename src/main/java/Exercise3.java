import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

class Exercise3 {

    private String str;
    private List<Object> array;

    Exercise3(File file) throws IOException {
        str = new BufferedReader(new FileReader(file)).readLine();
        array = new ArrayList<>();
    }

    List<Object> getArray() {
        return array;
    }

    public static void main(String[] args) throws IOException {

        Exercise3 et = new Exercise3(new File("exerciseThree.txt"));

        System.out.println("Enter your type:");
        Scanner scanner = new Scanner(System.in);
        String type = " ";

        while (!type.equalsIgnoreCase("exit")) {
            type = scanner.next();
            if (type.equalsIgnoreCase("int")) {
                et.findInteger();
                System.out.println(et.array);
            }
            if (type.equalsIgnoreCase("double")) {
                et.findDouble();
                System.out.println(et.array);
            }
            if (type.equalsIgnoreCase("char")) {
                et.findChar();
                System.out.println(et.array);
            }
            if (type.equalsIgnoreCase("string")) {
                et.findString();
                System.out.println(et.array);
            }
        }
    }

    void findDouble() {
        array = new ArrayList<>();
        for (String value : str.split(" ")) if (Pattern.matches("^[-]?[0-9]*\\.[0-9]*$", value))  array.add((Double.valueOf(value)));
    }

    void findInteger() {
        array = new ArrayList<>();
        for (String value : str.split(" ")) if (Pattern.matches("^[-]?\\d[0-9]*$", value)) array.add((Integer.valueOf(value)));
    }

    void findChar() {
        array = new ArrayList<>();
        for (String value : str.split(" ")) if (Pattern.matches("^[a-zA-Zа-яА-Я]$", value))  array.add(value);
    }

    void findString() {
        array = new ArrayList<>();
        for (String value : str.split(" ")) if (Pattern.matches("^[!@#$?%^&*()_+=-]?\\D{2,}$", value)) array.add(value);
    }
}