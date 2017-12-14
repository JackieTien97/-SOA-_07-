import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by Thpffcj on 2017/12/14.
 */
public class StudentListDOM {

    public DocumentBuilder getDocumentBuilder(){
        // 创建一个DocumentBuilderFactory的对象
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        // 创建DocumentBuilder对象
        DocumentBuilder documentBuilder = null;
        try {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return documentBuilder;
    }

    public void createXML(ArrayList<Student> students) {

        DocumentBuilder documentBuilder = getDocumentBuilder();
        Document document = documentBuilder.newDocument();

        Element studentList = document.createElement("学生列表");

        // 向学生列表根节点中添加子节点院系学生
        Element departmentStudent = document.createElement("院系学生");
        departmentStudent.setAttribute("院系编号", "1250");
        studentList.appendChild(departmentStudent);

        Element studentGrade = document.createElement("学生年级");
        studentGrade.setAttribute("年级", "大三");
        departmentStudent.appendChild(studentGrade);

        for (Student s : students) {
            Element student = document.createElement("学生");
            studentGrade.appendChild(student);

            Element studentBasicInfo = document.createElement("学生基本信息");
            student.appendChild(studentBasicInfo);

            Element studentID = document.createElement("学号");
            studentID.setTextContent(s.sid);
            studentBasicInfo.appendChild(studentID);

            Element studentName = document.createElement("姓名");
            studentName.setTextContent(s.name);
            studentBasicInfo.appendChild(studentName);

            Element studentSex = document.createElement("性别");
            studentSex.setTextContent(s.sex);
            studentBasicInfo.appendChild(studentSex);

            Element studentBirthDate = document.createElement("出生日期");
            studentSex.setTextContent(s.birthDate);
            studentBasicInfo.appendChild(studentBirthDate);

            Element studentIC = document.createElement("身份证号");
            studentSex.setTextContent(s.id);
            studentBasicInfo.appendChild(studentIC);

            Element studentMajor = document.createElement("专业");
            studentSex.setTextContent(s.major);
            studentBasicInfo.appendChild(studentMajor);

            Element studentInDate = document.createElement("入学时间");
            studentSex.setTextContent(s.inDate);
            studentBasicInfo.appendChild(studentInDate);

            Element studentTel = document.createElement("联系方式");
            studentSex.setTextContent(s.phone);
            studentBasicInfo.appendChild(studentTel);

            Element studentState = document.createElement("学籍状态");
            studentSex.setTextContent(s.xueji);
            studentBasicInfo.appendChild(studentState);


            Element studentScore = document.createElement("学生成绩");
            student.appendChild(studentScore);

            Element scoreDetails = document.createElement("成绩详情");
            scoreDetails.setAttribute("学期", "大三第一学期");
            studentScore.appendChild(scoreDetails);

            Element courseScorelist = document.createElement("课程成绩列表");
            scoreDetails.appendChild(courseScorelist);

            for (String score : s.scores) {
                String[] temp = score.split("-");
                Element courseScore = document.createElement("课程成绩");
                courseScore.setAttribute("课程编号", temp[0]);
                courseScore.setAttribute("成绩性质", temp[1]);
                courseScorelist.appendChild(courseScore);
                Element mark = document.createElement("成绩");
                courseScore.appendChild(mark);
                Element studentID1 = document.createElement("学号");
                studentID1.setTextContent(s.sid);
                mark.appendChild(studentID1);

                Element score_temp = document.createElement("得分");
                score_temp.setTextContent(temp[2]);
                mark.appendChild(score_temp);
            }
            studentGrade.appendChild(student);
        }


        // 将studentList节点添加到dom树中
        document.appendChild(studentList);

        // 创建TransformerFactory对象
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        try {
            // 创建Transformer对象
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(new DOMSource(document),new StreamResult(new File("studentListTest.xml")));
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
