package com.example.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.webapp.models.Post;
import com.example.webapp.repositories.PostRepository;

@SpringBootApplication
public class SpringWebAppApplication implements CommandLineRunner {
	
	@Autowired
	private PostRepository postRepositoty;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringWebAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		postRepositoty.save(new Post("Feed One", "caption 1"));
//		postRepositoty.save(new Post("Feed Two", "caption 2"));
//		postRepositoty.save(new Post("Feed Three", "caption 3"));
	}

}
