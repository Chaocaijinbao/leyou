package com.leyou.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class GlobalCorsConfig {

	@Bean
	public CorsFilter corsFilter() {
		CorsConfiguration config=new CorsConfiguration();
		config.addAllowedOrigin("http://manage.leyou.com");
		config.setAllowCredentials(false);
		config.addAllowedMethod("OPTIONS");
		config.addAllowedMethod("POST");
		config.addAllowedHeader("*");
		UrlBasedCorsConfigurationSource configSource=new UrlBasedCorsConfigurationSource();
		configSource.registerCorsConfiguration("/**", config);
		return new CorsFilter(configSource);
	}
}
