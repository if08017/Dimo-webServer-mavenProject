package ec2-52-77-232-42.ap-southeast-1.compute.amazonaws.com;
 
import org.junit.Assert;
import org.junit.Test;
 
public class AppTest{
    
    @Test
    public void testLengthOfCharacter(){
        App app=new App();
        Assert.assertEquals(5, app.stringLength("Agung"));
    }   
}
