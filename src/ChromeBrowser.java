import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;

public class ChromeBrowser {
    public static void main(String[] args) {
        /*
        Project-1 - ProjectName: com-tricentis
BaseUrl = https://demowebshop.tricentis.com/
1. Set up Chrome browser.
2. Open URL.
3. Print the title of the page.
4. Print the current URL.
5. Print the page source.
6. Navigate to Url.
“https://demowebshop.tricentis.com/login ”
7. Print the current URL.
8. Navigate back to the home page.
9. Navigate to the login page.
10. Print the current URL.
11. Refresh the page.
12. Enter the email in the email field.
13. Enter the password in the password field.
14. Click on the Login Button.
15. Close the browser.
         */


        //Launch the chrome browser
        WebDriver driver = new ChromeDriver();
        // Open the Url
        String baseurl = "https://demowebshop.tricentis.com/";
        driver.get(baseurl);

// Print the Title of the page
        String driverTitle = driver.getTitle();
        System.out.println(" The Driver Title  " + driverTitle);
// Print the current Url
        System.out.println("The Current Url + " + driver.getCurrentUrl());
        // Get Page Source
        System.out.println("The page Source : " + driver.getPageSource());
//Navigate to login URL
        String loginUrl = "https://demowebshop.tricentis.com/login";
        driver.navigate().to(loginUrl);
// print the current url
        System.out.println("The current Url = " + driver.getCurrentUrl());
        //Navigate back to Home page
        driver.navigate().to(baseurl);
        // Navigate to Login Url
        driver.navigate().to(loginUrl);
        // print the current Url
        System.out.println("The Current URL = " + driver.getCurrentUrl());
        //Refresh the page
        driver.navigate().refresh();
// Enter the Email in the email Field
        WebElement searchbox = driver.findElement(By.id("Email"));
        searchbox.sendKeys("jrs@tricentis.com");
// Enter the password
        WebElement searchbutton = driver.findElement(By.id("Password"));
        searchbutton.sendKeys("123456");
// Click on Login Botton
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
       //  driver.quit();
    }
}