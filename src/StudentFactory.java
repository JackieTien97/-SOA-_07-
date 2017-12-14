import java.time.LocalDate;
import java.util.ArrayList;

public class StudentFactory {
    private static StudentFactory studentFactory;

    private ArrayList<Student> studentList;

    private StudentFactory(){
        this.studentList=new ArrayList<Student>();
    }

    public static StudentFactory getInstance(){
        if(null==studentFactory){
            studentFactory=new StudentFactory();
        }
        return studentFactory;
    }

    //通过读文件的方式进行导入
    public ArrayList<Student> getStudents() {
//        ArrayList<Student> students = new ArrayList<>();
//        ArrayList<String> scores = new ArrayList<>();
//        scores.add("000001-平时成绩-30");
//        scores.add("000001-期末成绩-40");
//        scores.add("000001-总评成绩-50");
//        scores.add("000002-平时成绩-50");
//        scores.add("000002-期末成绩-90");
//        scores.add("000002-总评成绩-95");
//        scores.add("000003-平时成绩-30");
//        scores.add("000003-期末成绩-80");
//        scores.add("000003-总评成绩-70");
//        scores.add("000004-平时成绩-40");
//        scores.add("000004-期末成绩-98");
//        scores.add("000004-总评成绩-89");
//        scores.add("000005-平时成绩-50");
//        scores.add("000005-期末成绩-100");
//        scores.add("000005-总评成绩-100");
//        Student student = new Student("151250214", "朱应山", "男", LocalDate.of(1996,10,4), "522225199610047539", "软件工程", LocalDate.of(2015, 9,1), "15895873801", "是", scores);
//        students.add(student);

        return this.studentList;
    }

    private 
}
