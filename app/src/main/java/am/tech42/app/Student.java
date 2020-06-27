package am.tech42.app;

public class Student extends User {
    private String firstName;
    private String lastName;
    private int gpa;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getGpa() {
        return gpa;
    }
}
