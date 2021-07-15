package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden() {
        var loadinPage = homePage.clickDynamicLoading().clickExample1();
        loadinPage.clickStart();
        assertEquals(loadinPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
