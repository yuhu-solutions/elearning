package org.yuhu.solutions.elearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @see <a href="https://docs.spring.io/spring-boot/docs/current/reference/html/howto-embedded-servlet-containers.html">howto-embedded-servlet-containers</a>
 * @author Hugo
 *
 */
@SpringBootApplication(scanBasePackages = "org.yuhu.solutions")
public class Bootstrap {

	public static void main(String[] args) {
		SpringApplication.run(Bootstrap.class, args);
	}
}
