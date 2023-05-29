package com.sg.sbo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(r -> r.antMatchers("/", "/images/*").permitAll().anyRequest().authenticated())
				.exceptionHandling().and().oauth2Login();
		return http.build();
	}
}
