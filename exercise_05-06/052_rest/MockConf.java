package it.unical.inf.asd.restex;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MockConf {

  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }

}
