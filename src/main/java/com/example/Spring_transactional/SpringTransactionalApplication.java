package com.example.Spring_transactional;

import com.example.Spring_transactional.service.ServiceHelper;
import com.example.Spring_transactional.service.TaskService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringTransactionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTransactionalApplication.class, args);
	}

	@Bean
	public ApplicationRunner runner(TaskService taskService, ServiceHelper serviceHelper){
		return args -> {
			taskService.saveTask("Task 2");
		};
	}


}
