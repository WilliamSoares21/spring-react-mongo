package org.will.spring_react_mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringReactMongoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringReactMongoApplication.class, args);

  }

  @GetMapping("/")
  public String apiRoat() {
    return "Hello World!";
  }
}
