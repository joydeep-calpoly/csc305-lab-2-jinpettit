package task_one;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class Driver {
    public static void main(String[] args) {
        String[] inputFiles = {"input1.json", "input2.json", "input3.json"};

        for (String inputFile : inputFiles) {
            try {
                FileReader fileReader = new FileReader(inputFile);
                JSONTokener tokener = new JSONTokener(fileReader);
                JSONObject jsonObject = new JSONObject(tokener);

                String name = jsonObject.getString("name");

                JSONArray knownForArray = jsonObject.getJSONArray("knownFor");
                List<String> knownForList = new ArrayList<>();
                for (int i = 0; i < knownForArray.length(); i++) {
                    knownForList.add(knownForArray.getString(i));
                }

                JSONArray awardsArray = jsonObject.getJSONArray("awards");
                List<Award> awardsList = new ArrayList<>();
                for (int i = 0; i < awardsArray.length(); i++) {
                    JSONObject awardObj = awardsArray.getJSONObject(i);
                    String awardName = awardObj.getString("name");
                    int awardYear = awardObj.getInt("year");
                    awardsList.add(new Award(awardName, awardYear));
                }

                Person p = new Person(name, knownForList, awardsList);

                System.out.println(p);
                System.out.println();

            } catch (Exception e) {
                System.err.println("Error processing file: " + inputFile);
                e.printStackTrace();
            }
        }
    }
}
