import java.time.LocalDate;
import java.util.ArrayList;

public class Student {
    String sid;
    String name;
    String sex;
    LocalDate birthDate;
    String id;
    String major;
    LocalDate inDate;
    String phone;
    String xueji;
    ArrayList<String> scores;

    public Student(String sid, String name, String sex, LocalDate birthDate, String id, String major, LocalDate inDate, String phone, String xueji, ArrayList<String> scores) {
        this.sid = sid;
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.id = id;
        this.major = major;
        this.inDate = inDate;
        this.phone = phone;
        this.xueji = xueji;
        this.scores = scores;
    }
}
