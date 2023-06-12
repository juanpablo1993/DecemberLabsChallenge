Automation Project - December Labs Test

This project aims to automate the test of the December Labs Austin office page using Selenium WebDriver with Java.
The project contains a smoke test and a class that contains the requested tests.

Requirements

- Java 8 or higher installed on the system.
- Selenium WebDriver driver compatible with the desired browser (e.g., ChromeDriver for Google Chrome).

Environment Setup

1. Download the project from the repository.

2. Configure the Selenium WebDriver driver:
   - Download the Selenium WebDriver driver for the desired browser.
   - Place the driver in the appropriate location on your system.
   - Update the driver path in the `DecemberLabsTest.java` file in the `setUp()` method.

Running the Tests

1. Open the project in your preferred Java IDE.

2. Run the `DecemberLabsTest` class as a TestNG test.

3. Observe the execution of the test steps and the corresponding validations.

4. Upon completion of the execution, the test results will indicate if the tests were successful or if any errors were encountered in the validations.

Possible Improvements

- Modularize the test code into smaller, reusable methods.
- Add screenshots or generate reports at the end of the tests.
- Include additional tests to cover more functionalities and test scenarios.
- Perform the logging class.

Notes

- Ensure a stable internet connection during test execution, as the December Labs website will be accessed online.

- If you wish to use a different browser, download the corresponding Selenium WebDriver driver and update the driver configuration in the project.

- Ensure you have the necessary permissions to run automated tests on your system and selected browser.