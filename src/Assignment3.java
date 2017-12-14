import java.util.ArrayList;

public class Assignment3 {
    public static void main(String[] args) {
        StudentFactory factory = StudentFactory.getInstance();
        ArrayList<Student> students = factory.getStudents();
        StudentListDOM dom = new StudentListDOM();
        dom.createXML(students);
    }
}
