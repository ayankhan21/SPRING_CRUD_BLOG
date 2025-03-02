package com.ayankhan.springBlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.ayankhan.springBlog.repository")
public class SpringBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBlogApplication.class, args);
	}

}
