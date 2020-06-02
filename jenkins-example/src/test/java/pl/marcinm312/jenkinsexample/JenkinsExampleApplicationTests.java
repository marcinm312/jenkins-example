package pl.marcinm312.jenkinsexample;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsExampleApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void added() {
		JenkinsExampleApplication jexampleApplication = new JenkinsExampleApplication();
		assertEquals(10, jexampleApplication.added(5, 5));
	}

}
