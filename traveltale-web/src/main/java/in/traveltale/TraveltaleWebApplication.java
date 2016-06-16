package in.traveltale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author hungrymind
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = { "in.traveltale" })
@EnableAutoConfiguration
public class TraveltaleWebApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(TraveltaleWebApplication.class, args);
	}
}

