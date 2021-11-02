package com.wildecodeschool.deprecated;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
//@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index(){
		return "Spring is strange, Dr.!";
	}

	@RequestMapping("/info/")
	@ResponseBody
	public String info(){
		return "Info is strange, Dr.!";
	}

}
