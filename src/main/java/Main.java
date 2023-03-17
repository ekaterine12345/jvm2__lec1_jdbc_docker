import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
        System.out.println();

        Student student = new Student(1121, "ekaterine1111", "gurgenidze1");

        //StudentUtil.insertStudent(student);
        //StudentUtil.insertStudent(new Student(121, "blbla", "pppp"));


       List<Student> students =  StudentUtil.selectStudents();

       students.forEach(System.out::println);
    }//JDBCUtil-ის გარეშეც დავუკავშირდეი დოკერის ბაზის ცხრილს
}