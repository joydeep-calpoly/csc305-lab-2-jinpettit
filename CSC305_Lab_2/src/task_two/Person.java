package task_two;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

class Person {
    private final String name;
    private final List<String> knownFor;
    private final List<Award> awards;

    @JsonCreator
    public Person(@JsonProperty("name") String name,
                  @JsonProperty("knownFor") List<String> knownFor,
                  @JsonProperty("awards") List<Award> awards) {
        this.name = name;
        this.knownFor = knownFor;
        this.awards = awards;
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