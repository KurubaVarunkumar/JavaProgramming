import org.junit.Test;

public class IntegrationTest {
	 @Test
	    public void testMain() {
	        // Redirect standard output for testing
	        System.setOut(new java.io.PrintStream(new java.io.ByteArrayOutputStream()));

	        // Run the main method
	        Main.main(new String[]{});

	        // No assertion is needed; this test is mainly for checking that the program runs without errors
	    }
}
