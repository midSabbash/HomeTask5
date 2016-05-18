import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) throws IOException {

        filter();

    }

    private static void filter() throws IOException {

        File file = new File("exerciseThree.txt");

        if(!file.exists()) {
            file.createNewFile();
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("a bod 43,43 432     98 ,98");
                writer.flush();
                writer.close();
            }
        }

        String str,type;

        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<Double> doublesList = new ArrayList<>();
        ArrayList<String> charList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();

        FileReader reader = new FileReader(file);
        Scanner scanner = new Scanner(reader);

        while(scanner.hasNext()) {
            if(scanner.hasNextInt()) {
                intList.add(scanner.nextInt());
            } else if(scanner.hasNextDouble()) {
                doublesList.add(scanner.nextDouble());
            } else {
                str = scanner.next();
                if(str.length() == 1) {
                    charList.add(str);
                } else {
                    stringList.add(str);
                }
            }
            reader.close();
        }
        scanner.close();

        System.out.println("Enter type:");
        Scanner answer = new Scanner(System.in);
        type = answer.nextLine();

        if(type.equalsIgnoreCase("int")) {
            System.out.println(intList);
        } else if (type.equalsIgnoreCase("double")) {
            System.out.println(doublesList);
        } else if (type.equalsIgnoreCase("char")) {
            System.out.println(charList);
        } else if (type.equalsIgnoreCase("string")) {
            System.out.println(stringList);
        }
    }
}
