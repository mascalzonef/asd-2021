package it.unical.inf.asd.app1;

import it.unical.inf.asd.app1.bean.MyDAOBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class Application1 {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.scan("it.unical.inf.asd.app1");
    context.refresh();

    //Getting Bean by Class
    MyDAOBean myDAOBean = context.getBean(MyDAOBean.class);
    System.out.println(myDAOBean);
  }
}