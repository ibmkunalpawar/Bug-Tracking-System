import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import junit.framework.Assert;

class JunitTestCase {
	Tester tester;
	Developer developer;
	bug bug1;
	
	@BeforeEach
	void init() {
		tester = new tester("Raju");
		developer = new Developer("Sonu");
		bug1 = new Bug(BUGSTATUS.OPEN, SEVERITY.HIGH, "1" , "SYNTAX ERROR", "LINE90","project1","developer1","tester1")
	}
	@Test
	void testAssignBug() {
		developer.assign(bug1 , tester);
		String name = tester.toString();
		Assert.assertEquals(tester.getName(), name);
	}

}
