package task_one;

import java.util.List;

class Person {
    private final String name;
    private final List<String> knownFor;
    private final List<Award> awards;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("\n\n");
        sb.append("Known For:\n");
        for (String known : knownFor) {
            sb.append("\t").append(known).append("\n");
        }
        sb.append("\nAwards:\n");
        for (Award award : awards) {
            sb.append("\t").append(award).append("\n");
        }
        return sb.toString();
    }
}