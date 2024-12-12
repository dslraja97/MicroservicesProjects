package com.learning.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	protected SecurityFilterChain secureFilter(HttpSecurity httpSecurity) throws Exception {
		httpSecurity
				.authorizeHttpRequests(
						(req) -> req.requestMatchers("/loginpage", "/contact").permitAll().anyRequest().authenticated())
				.formLogin(form -> form.defaultSuccessUrl("/", true) // Redirect to home after successful login
						.permitAll() // Allow access to the login page for everyone
				).logout(logout -> logout.logoutUrl("/logout") // Default logout URL
						.logoutSuccessUrl("/") // Redirect to home after logout
						.permitAll() // Allow access to the logout endpoint
				);

		return httpSecurity.build();
	}

}
