
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

public class OrangeHRMAutomationTest{

    WebDriver driver;
    WebDriverWait wait;

    ExtentReports extent;
    ExtentTest test;

    @BeforeClass
    public void setup() {

        new File("reports").mkdirs();

        extent = new ExtentReports();

        ExtentSparkReporter spark =
                new ExtentSparkReporter("reports/report.html");

        extent.attachReporter(spark);

        ChromeOptions options = new ChromeOptions();

        // Used when executing tests in GitHub Actions
        if (Boolean.parseBoolean(System.getProperty("headless", "false"))) {
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
        }

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Test
    public void orangeHRMTest() throws Exception {

        test = extent.createTest("OrangeHRM Automation Test");

        try {

            // Open OrangeHRM
            driver.get("https://opensource-demo.orangehrmlive.com/");

            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.name("username")));

            test.pass("OrangeHRM website opened successfully");

            capture(driver, test, "01_Home");

            // Login
            driver.findElement(By.name("username")).sendKeys("Admin");

            driver.findElement(By.name("password")).sendKeys("admin123");

            driver.findElement(
                    By.cssSelector("button[type='submit']")).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h6[text()='Dashboard']")));

            test.pass("Login successful");

            capture(driver, test, "02_Dashboard");

            // PIM Module
            driver.findElement(
                    By.xpath("//span[text()='PIM']")).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h6[text()='PIM']")));

            test.pass("PIM module opened successfully");

            capture(driver, test, "03_PIM");

            // Admin Module
            driver.findElement(
                    By.xpath("//span[text()='Admin']")).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h6[text()='User Management']")));

            test.pass("Admin module opened successfully");

            capture(driver, test, "04_Admin");

        } catch (Exception e) {

            test.fail("Automation failed: " + e.getMessage());

            try {
                capture(driver, test, "Failure");
            } catch (Exception screenshotError) {
                System.out.println("Failure screenshot could not be saved");
            }

            throw e;
        }
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }

        if (extent != null) {
            extent.flush();
        }

        System.out.println("Automation execution completed");
        System.out.println("Report: reports/report.html");
    }

    public static void capture(
            WebDriver driver,
            ExtentTest test,
            String name) throws Exception {

        File src = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);

        File dest = new File("reports/" + name + ".png");

        Files.copy(
                src.toPath(),
                dest.toPath(),
                StandardCopyOption.REPLACE_EXISTING
        );

        test.addScreenCaptureFromPath(name + ".png");
    }
}
