package it.unical.inf.asd.conf;

import it.unical.inf.asd.ext.ManagerBean;
import it.unical.inf.asd.ext.ManagerBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean(name="managerBean")
  public ManagerBean helloWorld()
  {
    return new ManagerBeanImpl();
  }
}