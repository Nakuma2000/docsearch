import static org.junit.Assert.*;
import org.junit.*;

public class DocSearchTest {
	@Test 
	public void testHandleRequest() 
    {
        String input = "/";
        DocSearchServer.handleRequest(input);
        assertEquals("There are 0 files to search", DocSearchServer.handleRequest(input));
    }
}
