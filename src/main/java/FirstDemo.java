import org.testng.annotations.*;

public class FirstDemo {
	
	@Test(priority=3,alwaysRun=true)
	public void s() {
		System.out.println("my test case 1 ..");
	}
	
	@Test(priority=3)
	public void a() {
		System.out.println("my test case 2 ..");
	}

	
	@AfterTest(alwaysRun=true)
	public void p() {
		System.out.println("my test case 3 ..");
	}


}
