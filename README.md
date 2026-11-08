# OrangeHRM Automation Testing – Extent Reports

## 📌 Project Overview

ExtendReportAutomation is a web automation testing project developed using **Java, Selenium WebDriver, and TestNG** to automate the OrangeHRM demo application.

The project validates the login functionality and navigation across important modules such as Dashboard, PIM, and Admin.

It integrates **ExtentReports** to generate detailed HTML execution reports with screenshots. It also includes a GitHub Actions workflow for CI/CD automation.

## 🌐 Application Under Test

https://opensource-demo.orangehrmlive.com/

## 🛠️ Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- ExtentReports
- ChromeDriver
- Git and GitHub
- GitHub Actions

## 🧪 Automated Test Scenarios

The automation script covers:

1. Launch OrangeHRM application.
2. Verify the login page.
3. Enter valid login credentials.
4. Verify successful login.
5. Validate the Dashboard page.
6. Navigate to the PIM module.
7. Verify the PIM module.
8. Navigate to the Admin module.
9. Verify the User Management page.
10. Capture screenshots at each major stage.

## 📂 Project Structure

```text
ExtendReportAutomation/
│
├── .github/
│   └── workflows/
│       └── selenium-tests.yml
│
├── .mvn/
│
├── reports/
│   ├── 01_Home.png
│   ├── 02_Dashboard.png
│   ├── 03_PIM.png
│   ├── 04_Admin.png
│   └── report.html
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org.example/
│   │   │       └── Main.java
│   │   └── resources/
│   │
│   └── test/
│       └── java/
│           └── OrangeHRMAutomationTest.java
│
├── .gitignore
├── pom.xml
└── README.md
```

## ⚙️ Prerequisites

Make sure you have installed:

- Java JDK
- IntelliJ IDEA or Eclipse
- Google Chrome
- Maven

## 🚀 How to Run the Project

**1. Clone the repository**

```bash
git clone # OrangeHRM Automation Testing – Extent Reports

## 📌 Project Overview

ExtendReportAutomation is a web automation testing project developed using **Java, Selenium WebDriver, and TestNG** to automate the OrangeHRM demo application.

The project validates the login functionality and navigation across important modules such as Dashboard, PIM, and Admin.

It integrates **ExtentReports** to generate detailed HTML execution reports with screenshots. It also includes a GitHub Actions workflow for CI/CD automation.

## 🌐 Application Under Test

https://opensource-demo.orangehrmlive.com/

## 🛠️ Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- ExtentReports
- ChromeDriver
- Git and GitHub
- GitHub Actions

## 🧪 Automated Test Scenarios

The automation script covers:

1. Launch OrangeHRM application.
2. Verify the login page.
3. Enter valid login credentials.
4. Verify successful login.
5. Validate the Dashboard page.
6. Navigate to the PIM module.
7. Verify the PIM module.
8. Navigate to the Admin module.
9. Verify the User Management page.
10. Capture screenshots at each major stage.

## 📂 Project Structure

```text
ExtendReportAutomation/
│
├── .github/
│   └── workflows/
│       └── selenium-tests.yml
│
├── .mvn/
│
├── reports/
│   ├── 01_Home.png
│   ├── 02_Dashboard.png
│   ├── 03_PIM.png
│   ├── 04_Admin.png
│   └── report.html
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org.example/
│   │   │       └── Main.java
│   │   └── resources/
│   │
│   └── test/
│       └── java/
│           └── OrangeHRMAutomationTest.java
│
├── .gitignore
├── pom.xml
└── README.md
```

## ⚙️ Prerequisites

Make sure you have installed:

- Java JDK
- IntelliJ IDEA or Eclipse
- Google Chrome
- Maven

## 🚀 How to Run the Project

**1. Clone the repository**

```bash
git clone https://github.com/rithi-ka-v/OrangeHRM-Selenium-Automation.git
```

**2. Open the project**

Open `ExtendReportAutomation` in IntelliJ IDEA.

**3. Install Maven dependencies**

```bash
mvn clean install
```

**4. Execute the automation test**

```bash
mvn test
```

## 📊 Extent Reports

After execution, the HTML report is generated at:

```text
reports/report.html
```

The report provides:

- Test execution status
- Passed and failed test details
- Execution logs
- Screenshot evidence

Open the HTML report in a browser to view the test results.

## 📸 Screenshot Evidence

Screenshots are captured during the following stages:

| Screenshot | Description |
|---|---|
| 01_Home.png | OrangeHRM Login Page |
| 02_Dashboard.png | Dashboard after login |
| 03_PIM.png | PIM Module |
| 04_Admin.png | Admin Module |

Failure screenshots are also captured when an automation exception occurs.

## ⚡ GitHub Actions – CI/CD

This project includes a GitHub Actions workflow:

```text
.github/workflows/selenium-tests.yml
```

The workflow is intended to support automated Selenium test execution through GitHub Actions.

The test code also supports headless Chrome execution using:

```bash
-Dheadless=true
```

## ✨ Key Features

- Automated OrangeHRM login testing
- Dashboard validation
- PIM module verification
- Admin module verification
- Explicit waits using WebDriverWait
- Screenshot capture using TakesScreenshot
- ExtentReports HTML reporting
- Exception handling and failure reporting
- Headless Chrome execution support
- GitHub Actions workflow integration

## 👩‍💻 Author

**Rithi**

Java | Selenium WebDriver | TestNG | Maven | Automation Testing

---

⭐ If you find this project useful, feel free to explore the repository!
```

**2. Open the project**

Open `ExtendReportAutomation` in IntelliJ IDEA.

**3. Install Maven dependencies**

```bash
mvn clean install
```

**4. Execute the automation test**

```bash
mvn test
```

## 📊 Extent Reports

After execution, the HTML report is generated at:

```text
reports/report.html
```

The report provides:

- Test execution status
- Passed and failed test details
- Execution logs
- Screenshot evidence

Open the HTML report in a browser to view the test results.

## 📸 Screenshot Evidence

Screenshots are captured during the following stages:

| Screenshot | Description |
|---|---|
| 01_Home.png | OrangeHRM Login Page |
| 02_Dashboard.png | Dashboard after login |
| 03_PIM.png | PIM Module |
| 04_Admin.png | Admin Module |

Failure screenshots are also captured when an automation exception occurs.

## ⚡ GitHub Actions – CI/CD

This project includes a GitHub Actions workflow:

```text
.github/workflows/selenium-tests.yml
```

The workflow is intended to support automated Selenium test execution through GitHub Actions.

The test code also supports headless Chrome execution using:

```bash
-Dheadless=true
```

## ✨ Key Features

- Automated OrangeHRM login testing
- Dashboard validation
- PIM module verification
- Admin module verification
- Explicit waits using WebDriverWait
- Screenshot capture using TakesScreenshot
- ExtentReports HTML reporting
- Exception handling and failure reporting
- Headless Chrome execution support
- GitHub Actions workflow integration

## 👩‍💻 Author

**Rithi**

Java | Selenium WebDriver | TestNG | Maven | Automation Testing

---

⭐ If you find this project useful, feel free to explore the repository!