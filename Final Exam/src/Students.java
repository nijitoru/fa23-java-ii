//Judy Marie Delos Reyes
//11-29-2023
//Decends from Person class.
public class Students extends Person {
    private String major;
    private int tuition;
    // Constructor
    public Students(String firstName, String lastName, int age, String gender, String major, int tuition) {
        // makes sure age is within the range of 20 - 40
        super(firstName, lastName, (age < 20 || age > 40) ? 20 : age, gender);
        // makes sure tuition is within the range of 1000 - 2000
        this.tuition = (tuition >= 1000 && tuition <= 2000) ? tuition : 1000;
        this.major = major;
    }
    // set method for major
    public void setMajor(String major) {
        this.major = major;
    }
    // set method for tuition
    public void setTuition(int tuition) {
        // makes sure tuition is within the range of 1000 - 2000
        this.tuition = (tuition >= 1000 && tuition <= 2000) ? tuition : 1000;
    }
    public String getMajor() {
        return major;
    }
    public int getTuition() {
        return tuition;
    }
}
