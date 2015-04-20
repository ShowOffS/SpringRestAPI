package in.showoffs.medstore.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;


@Configuration
@EnableJpaRepositories
public class PersistenceConfiguration extends JpaRepositoryConfigExtension{

}
