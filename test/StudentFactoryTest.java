import org.junit.Assert;

import java.util.List;

import static org.junit.Assert.*;

public class StudentFactoryTest {
    private StudentFactory studentFactory;
    @org.junit.Before
    public void setUp() throws Exception {
        this.studentFactory=StudentFactory.getInstance();
    }

    @org.junit.Test
    public void getStudents() throws Exception {
        List<Student> students=studentFactory.getStudents();
        Assert.assertEquals(1,students.size());
        Assert.assertEquals("朱应山",students.get(0).name);
    }

}