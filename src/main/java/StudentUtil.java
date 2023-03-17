import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentUtil {

    public static void insertStudent(Student student) throws SQLException {
        String insertSQL = "INSERT INTO STUDENTS(ID, FIRST_NAME, LAST_NAME) VALUES("+
                student.getID()+","
                +"'"+student.getFirst_name()+"', "
                +"'"+student.getLast_name()+"'); ";

        JDBCUtil.getStatement().executeUpdate(insertSQL);

        System.out.println("Inserted student "+student.getFirst_name()+" into table Successfully!");
    }

    public static List<Student> selectStudents() throws SQLException {
        String selectSQL = "SELECT * FROM STUDENTS";

        List<Student> students = new ArrayList<>();
        ResultSet resultSet = JDBCUtil.getStatement().executeQuery(selectSQL);

        while (resultSet.next()){
            students.add(new Student(
                    resultSet.getInt("ID"),
                    resultSet.getString("FIRST_NAME"),
                    resultSet.getString("LAST_NAME")
            ));
        }

        return students;
    }
}
