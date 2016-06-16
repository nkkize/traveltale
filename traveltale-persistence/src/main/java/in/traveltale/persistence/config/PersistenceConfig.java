/**
 * 
 */
package in.traveltale.persistence.config;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author hungrymind
 *
 */
@Configuration
@EnableJpaRepositories(basePackages = { "in.traveltale.persistence.repositories" })
@EntityScan(basePackages = { "in.traveltale.persistence.entities" })
public class PersistenceConfig {

}
