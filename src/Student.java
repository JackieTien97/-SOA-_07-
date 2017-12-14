import java.util.ArrayList;

public class Student {
    String sid;
    String name;
    String sex;
    String birthDate;
    String id;
    String major="软件工程";
    String inDate;
    String phone;
    String xueji;
    ArrayList<String> scores;

    public Student(ArrayList<String> infoStr){
        this.sid=infoStr.get(0);
        this.name=infoStr.get(1);
        this.sex=infoStr.get(2);
        this.birthDate=infoStr.get(3);
        this.id=infoStr.get(4);
        this.inDate=infoStr.get(5);
        this.phone=infoStr.get(6);
        this.xueji=infoStr.get(7);
        this.scores=new ArrayList<>();
        for(int i=8;i<infoStr.size();i++){
            scores.add(infoStr.get(i));
        }
    }


    public Student(String sid, String name, String sex, String birthDate, String id, String major, String inDate, String phone, String xueji, ArrayList<String> scores) {
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
