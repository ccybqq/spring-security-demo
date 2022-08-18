package pers.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
public class SecurityApplication {
	// Shortcutting for convenience.
	@Autowired
	private IMyUserRepo userRepo;

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

	@PostConstruct
	private void initUsers() {
		userRepo.saveAll(
				List.of(
						new MyUser(1, "User1", "Password1"),
						new MyUser(2, "User2", "Password2"),
						new MyUser(3, "User3", "Password3")
				)
		);
	}
}
