import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {
    @FindBy(id = "com.google.android.calculator:id/digit_1")
    WebElement btn1;
    @FindBy(id = "com.google.android.calculator:id/digit_0")
    WebElement btn0;
    @FindBy(id = "com.google.android.calculator:id/op_div")
    WebElement btndiv;
    @FindBy(id = "com.google.android.calculator:id/op_mul")
    WebElement btnmul;
    @FindBy(id = "com.google.android.calculator:id/op_sub")
    WebElement btnsub;
    @FindBy(id = "com.google.android.calculator:id/op_add")
    WebElement btnadd;
    @FindBy(id = "com.google.android.calculator:id/digit_5")
    WebElement btn5;
    @FindBy(id = "com.google.android.calculator:id/digit_6")
    WebElement btn6;
    @FindBy(id = "com.google.android.calculator:id/eq")
    WebElement btneql;
    @FindBy(id = "com.google.android.calculator:id/result_final")
    WebElement txtResult;

    public CalcScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String doSeries(AndroidDriver driver, int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + a + "")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + b + "")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + c + "")).click();
        btndiv.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + d + "")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + e + "")).click();
        btnmul.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + f + "")).click();
        btnsub.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + g + "")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + h + "")).click();
        btnadd.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + i + "")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + j + "")).click();
        btneql.click();
        return txtResult.getText();

    }
}