package io.app;

import io.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("io")
@RestController
@RequestMapping
public class DemoApplication {

	public static void main(String[] args) {

		Config config = new Config();
		config.setHashCode(args[0]);

		SpringApplication.run(DemoApplication.class, args);
		System.out.println("BACKEND [ONLINE]. hashCode => " + config.getHashCode());
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public void statusCheck(Config config){}
}
