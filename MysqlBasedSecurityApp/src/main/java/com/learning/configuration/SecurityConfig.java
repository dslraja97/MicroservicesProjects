package com.learning.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	/*
	 * @Autowired private DataSource dataSource;
	 * 
	 * @Autowired public void authManager(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
	 * authenticationManagerBuilder.jdbcAuthentication().dataSource(dataSource).passwordEncoder(new BCryptPasswordEncoder())
	 * .usersByUsernameQuery("select username, password, enabled from user where username=?")
	 * .authoritiesByUsernameQuery("select username, authority from authorities where username=?"); }
	 * 
	 * @Bean public SecurityFilterChain securityConfiguration(HttpSecurity httpSecurity) throws Exception {
	 * 
	 * httpSecurity .authorizeHttpRequests((req) -> req.requestMatchers("/admin").hasRole("ADMIN").requestMatchers("/user")
	 * .hasAnyRole("USER", "ADMIN").requestMatchers("/").permitAll().anyRequest().authenticated()) .formLogin(form ->
	 * form.loginPage("/login") // Specify your custom login page or use the default .permitAll() // Allow everyone to access the
	 * login page );
	 * 
	 * return httpSecurity.build(); }
	 */

	@Autowired
	private DataSource dataSource;

	@Bean
	protected PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	protected AuthenticationManager authenticationManager(HttpSecurity httpSecurity) throws Exception {
		AuthenticationManagerBuilder authBuilder = httpSecurity.getSharedObject(AuthenticationManagerBuilder.class);
		authBuilder.jdbcAuthentication().dataSource(dataSource).passwordEncoder(passwordEncoder())
				.usersByUsernameQuery("select username, password, enabled from user where username = ?")
				.authoritiesByUsernameQuery("select username, authority from authorities where username = ?");
		return authBuilder.build();
	}

	@Bean
	protected SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity
				.authorizeHttpRequests((req) -> req.requestMatchers("/admin").hasRole("ADMIN").requestMatchers("/user")
						.hasAnyRole("USER", "ADMIN").requestMatchers("/").permitAll().anyRequest().authenticated())
				.formLogin(form -> form.defaultSuccessUrl("/", true) // Redirect to home after successful login
						.permitAll() // Allow access to the login page for everyone
				).logout(logout -> logout.logoutUrl("/logout") // Default logout URL
						.logoutSuccessUrl("/") // Redirect to home after logout
						.permitAll() // Allow access to the logout endpoint
				);

		return httpSecurity.build();
	}

}
