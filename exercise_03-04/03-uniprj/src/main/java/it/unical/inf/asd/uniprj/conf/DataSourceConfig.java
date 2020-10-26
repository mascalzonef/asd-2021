package it.unical.inf.asd.uniprj.conf;

import com.zaxxer.hikari.HikariDataSource;
import it.unical.inf.asd.uniprj.data.entities.Course;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;

//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(basePackages = {"it.unical.inf.asd.uniprj.services"},
//    entityManagerFactoryRef = "entityManagerFactory",
//    transactionManagerRef= "transactionManager")
public class DataSourceConfig {

  @Value("${spring.datasource.show-sql}")
  private String showSql;

  @Bean
  @Primary
  public DataSourceProperties getDataSourceProperties() {
    return new DataSourceProperties();
  }

  @Bean
  @Primary
  public DataSource dataSource() {
    return getDataSourceProperties().initializeDataSourceBuilder()
        .type(HikariDataSource.class).build();
  }

  @Bean(name = "entityManagerFactory")
  @Primary
  public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder) {
    return builder
        .dataSource(dataSource())
        .packages(Course.class)
        .properties(addProperties())
        .build();
  }

  @Primary
  @Bean
  public PlatformTransactionManager transactionManager(
      final @Qualifier("entityManagerFactory") LocalContainerEntityManagerFactoryBean entityManagerFactory) {
    return new JpaTransactionManager(entityManagerFactory.getObject());
  }

  private HashMap<String, Object> addProperties() {
    HashMap<String, Object> m = new HashMap<>();
    m.put(AvailableSettings.SHOW_SQL, showSql);
    return m;
  }
}
