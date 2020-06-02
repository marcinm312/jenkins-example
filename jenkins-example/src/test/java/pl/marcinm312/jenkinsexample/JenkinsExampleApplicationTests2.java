package pl.marcinm312.jenkinsexample;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class JenkinsExampleApplicationTests2 {

	@Test
	public void added() {
		JenkinsExampleApplication jexampleApplication = new JenkinsExampleApplication();
		assertEquals(10, jexampleApplication.added(5, 5));
	}

}
