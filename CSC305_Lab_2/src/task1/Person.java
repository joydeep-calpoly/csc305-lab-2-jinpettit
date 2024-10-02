package task1;

import java.util.List;

public class Person {
    private String name;
    private List<String> knownFor;
    private List<Award> awards;

    public Person(String name, List<String> knownFor, List<Award> awards) {
        this.name = name;
        this.knownFor = knownFor;
        this.awards = awards;
    }

    public String getName() {
        return name;
    }

    public List<String> getKnownFor() {
        return knownFor;
    }

    public List<Award> getAwards() {
        return awards;
    }
}