import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void test(){
       int res= Main.five();
        System.out.println(res);
        Assert.assertEquals(5, res);
    }
}
