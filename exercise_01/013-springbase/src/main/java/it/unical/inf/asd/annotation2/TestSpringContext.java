package it.unical.inf.asd.annotation2;

import it.unical.inf.asd.annotation2.conf.AppConfig;
import it.unical.inf.asd.annotation2.controller.StudentController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringContext
{
    public static void main(String[] args) 
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        StudentService manager = (StudentService) context.getBean(StudentService.class);
         
        //OR this will also work
         
        StudentController controller = (StudentController) context.getBean("studentController");
         
        System.out.println(controller.createNewStudent());
    }
}