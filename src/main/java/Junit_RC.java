/*import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class Junit_RC {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://52.43.254.234/");
		selenium.start();
	}

	@Test
	public void testUntitled() throws Exception {
		selenium.open("/users/sign_in");
		selenium.type("id=user_password", "admin@admin.com");
		selenium.type("id=user_email", "admin@admin.com");
		selenium.click("name=commit");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Dashboard");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Admin A");
		selenium.click("link=Logout");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
*/