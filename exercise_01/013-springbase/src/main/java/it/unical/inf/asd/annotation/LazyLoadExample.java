package it.unical.inf.asd.annotation;

import it.unical.inf.asd.annotation.config.AppConfig;
import it.unical.inf.asd.annotation.bean.Employee;
import it.unical.inf.asd.annotation.controller.EmployeeController;
import it.unical.inf.asd.annotation.service.EmployeeManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LazyLoadExample {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

    System.out.println("Bean Factory Initialized !!");

    EmployeeController employeeController = ctx.getBean(EmployeeController.class);
    EmployeeManager empManager = employeeController.getManagerInstance();
    Employee emp = empManager.create();

    System.out.println(emp);
  }
}