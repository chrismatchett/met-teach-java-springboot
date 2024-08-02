// package com.helloworld.welcome;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class WelcomeApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(WelcomeApplication.class, args);
// 	}

// }

package com.helloworld.welcome;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WelcomeApplication {
    public static void main(String[] args) {
      SpringApplication.run(WelcomeApplication.class, args);
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
    }
}
