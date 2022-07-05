package pl.marcinm312.jenkinsexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsExampleApplication.class, args);
	}

	public int added(int a, int b) {
		return a + b;
	}

	@GetMapping
	public String get() {
		return "hello";
	}
}
