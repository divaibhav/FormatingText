import org.example.Student;
import org.example.StudentDAO;

import java.util.ArrayList;
import java.util.List;

public class DemoFormatter {
    public static void main(String[] args) {

        //System.out.format("%-10d %-30s\n", 10, "Vaibhav");
        List<Student> studentList = new StudentDAO().getAllStudent();


        printList(studentList);
    }

    private static void printList(List<Student> studentList) {
        System.out.format("%-10s %-30s\n","id", "Name" );
        for (Student student : studentList) {
            System.out.format("%-10d %-30s\n",student.getRollno(), student.getName());
        }
    }
}
