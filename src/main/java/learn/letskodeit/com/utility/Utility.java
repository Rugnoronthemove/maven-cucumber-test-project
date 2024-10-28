package learn.letskodeit.com.utility;

import learn.letskodeit.com.browserfactory.ManageBrowser;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class Utility extends ManageBrowser {

    /**
     * This method will generate random number
     */
    public int generateRandomNumber()
    {
        return (int) (Math.random() * 5000 + 1);

    }

    /**
     * This method will generate random string
     */
    public static String getRandomString(int length)
    {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    /**
     * This method will click on element
     */
    public void clickOnElement(WebElement element)
    {
        element.click();
    }

    /**
     * This method will get text from element
     */
    public String getTextFromElement(WebElement element)
    {
        return element.getText();
    }

    /**
     * This method will send text on element
     */
    public void sendTextToElement(WebElement element, String str)
    {
        element.sendKeys(str);
    }

    /**
     * Take screenshot in Byte Format
     */
    public static byte[] getScreenShot()
    {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
