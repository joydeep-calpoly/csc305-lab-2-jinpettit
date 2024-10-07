package task_two;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {
        String[] inputFiles = {"input1.json", "input2.json", "input3.json"};

        ObjectMapper objectMapper = new ObjectMapper();

        for (String inputFile : inputFiles) {
            try {
                Person p = objectMapper.readValue(new File(inputFile), Person.class);

                System.out.println(p);
                System.out.println();

            } catch (Exception e) {
                System.err.println("Error processing file: " + inputFile);
                e.printStackTrace();
            }
        }
    }
}
