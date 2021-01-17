package io.javabrainss.coranivirus_trackerr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoranivirusTrackerrApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoranivirusTrackerrApplication.class, args);
	}

}
