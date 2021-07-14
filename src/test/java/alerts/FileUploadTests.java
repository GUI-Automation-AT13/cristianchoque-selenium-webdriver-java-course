package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFieldUpload() {
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("D:/GUI Testing/courseTAU/cristianchoque-selenium-webdriver-java-course/resources/name.png");
        assertEquals(uploadPage.getUploadedFiles(), "name.png", "Uploaded error");
    }
}
