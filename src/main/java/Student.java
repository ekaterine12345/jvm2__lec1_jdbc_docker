public class Student {
    private int ID;
    private String first_name;
    private String last_name;

    public Student(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Student(int ID, String first_name, String last_name) {
        this.ID = ID;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }
}
