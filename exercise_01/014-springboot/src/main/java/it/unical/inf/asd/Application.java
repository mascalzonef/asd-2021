package it.unical.inf.asd;

import it.unical.inf.asd.controller.StudentController;
import it.unical.inf.asd.dto.StudentDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		StudentController bean = ctx.getBean(StudentController.class);
		StudentDTO newStudent = bean.createNewStudent();

		System.out.println(newStudent);
	}

}
