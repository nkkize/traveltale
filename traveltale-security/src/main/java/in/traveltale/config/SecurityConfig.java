/**
 * 
 */
package in.traveltale.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author hungrymind
 *
 */
@Configuration
@ComponentScan(basePackages = { "in.traveltale" })
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


	@Override
	protected void configure(HttpSecurity http) throws Exception {
		 http
		 	.formLogin()
		 		.loginPage("/")
		 		.defaultSuccessUrl("/")
		 		.permitAll()
		 		.and()
		 	.logout()
                .permitAll()
                .and()
		 	.authorizeRequests()
		 		.antMatchers("/greetings")
		 			.permitAll()
		 		.anyRequest()
		 		.authenticated()
		 		.and()
		 	.csrf()
		 		.disable();
	}
	
}
