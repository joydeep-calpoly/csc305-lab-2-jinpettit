package task_two;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

class Award {
    private final String name;
    private final int year;

    @JsonCreator
    public Award(@JsonProperty("name") String name, @JsonProperty("year") int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return name + ", " + year;
    }
}

