import org.testng.annotations.BeforeClass;
import commom.WebApp;

public class BaseOperation {
	WebApp webapp = WebApp.getInstance();
	@BeforeClass
	public void performTest() {
		this.webapp= WebApp.getInstance();
		
		
	}
}
