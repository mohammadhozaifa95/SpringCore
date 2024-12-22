package springcore;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
    private String id;
    private List<String> nmae;  // This property must match XML
    private Set<Integer> number;
    private Map<String, String> course;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getNmae() {  // Getter method must match
        return nmae;
    }

    public void setNmae(List<String> nmae) {  // Setter method must match
        this.nmae = nmae;
    }

    public Set<Integer> getNumber() {
        return number;
    }

    public void setNumber(Set<Integer> number) {
        this.number = number;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }

    public Emp(String id, List<String> nmae, Set<Integer> number, Map<String, String> course) {
        super();
        this.id = id;
        this.nmae = nmae;
        this.number = number;
        this.course = course;
    }

    public Emp() {
        super();
    }

    @Override
    public String toString() {
        return "Emp [id=" + id + ", nmae=" + nmae + ", number=" + number + ", course=" + course + "]";
    }
}
