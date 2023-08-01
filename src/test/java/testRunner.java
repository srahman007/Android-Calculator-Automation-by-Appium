import org.testng.Assert;
import org.testng.annotations.Test;

public class testRunner extends Setup {
    @Test
    public void doSeries(){
        CalcScreen calcScreen = new CalcScreen(driver);
        String res = calcScreen.doSeries(driver, 1, 0, 0, 1, 0, 5, 1, 0, 6, 0);
        Assert.assertTrue(res.contains("100"));
    }
}
