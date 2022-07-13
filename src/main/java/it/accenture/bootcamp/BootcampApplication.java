package it.accenture.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampApplication.class, args);
	}

	// The initDB() @Bean is run automatically on startup, before the
	// @RestController is started.
	// The body could access command line argument args (but doesn't).
	// The fact that initDB() requires a WelcomeService argument tells Spring
	// to auto-configure and pass EventService, InterestService and UserService
	// instances, which initDB()
	// amends by adding more events instances.
	// @Bean
	// public CommandLineRunner initDB(EducationService eduService) {
	// return (args) -> {
	// };
	// }

}
