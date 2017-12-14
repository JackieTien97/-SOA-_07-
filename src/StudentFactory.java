import java.io.*;
import java.util.ArrayList;

public class StudentFactory {
    private static StudentFactory studentFactory;
    private final String path="./studentInfo";

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
        File file=new File(path);
        File[] files=file.listFiles();

        for (File curStu:files) {
            Student student=getStudent(curStu);
            if(student!=null){
                this.studentList.add(student);
            }
        }

        return this.studentList;
    }

    private Student getStudent(File file){
        try{
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line=null;
            ArrayList<String> list=new ArrayList<>();
            while ((line=br.readLine())!=null){
                list.add(line);
            }
            br.close();
            Student student=new Student(list);
            return student;
        }catch (IOException ioe){
            ioe.printStackTrace();
            return null;
        }
    }
}
