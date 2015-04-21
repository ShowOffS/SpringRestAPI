package in.showoffs.medstore;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableJpaRepositories
@SpringBootApplication
public class MedstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedstoreApplication.class, args);
    }
    
   /* @Bean
    public BasicDataSource dataSource() throws URISyntaxException {
    	
    	URI dbUri = new URI(System.getenv("DATABASE_URL"));

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();
        
    	String username = "postgres";
    	String password = "fuckers";
    	String dbUrl = "jdbc:postgresql://localhost:5432/medstore";
    	
        BasicDataSource dataSource = new BasicDataSource();
         
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
         
        return dataSource;
    }*/
}
