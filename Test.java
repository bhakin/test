import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest{

    @Test
    public void test1(){
        assertEquals(10, SkillDemo.multiply(5,5));
    }
}