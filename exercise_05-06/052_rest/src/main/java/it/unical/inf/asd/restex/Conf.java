package it.unical.inf.asd.restex;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Conf {

  @Bean
  public ModelMapper getModelMapper() {return new ModelMapper();}

}
