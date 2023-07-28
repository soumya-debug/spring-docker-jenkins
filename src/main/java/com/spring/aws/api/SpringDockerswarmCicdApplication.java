package com.spring.aws.api;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class SpringDockerswarmCicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerswarmCicdApplication.class, args);
	}

}

@Controller
class IndexController{
	
	static String randomWebAppID= new String(new Random().toString());
	
	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "[WEBAPPID "+ randomWebAppID + "] Hello World from Spring";
	}
}

 class MyTestClass {
    public static void main(String[] args) {
        System.out.println("Working Directory: " + System.getProperty("user.dir"));
    }
}
