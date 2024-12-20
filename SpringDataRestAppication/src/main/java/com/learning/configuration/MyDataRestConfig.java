package com.learning.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		HttpMethod[] unsupportedMethoud = { HttpMethod.DELETE, HttpMethod.PUT };

		config.getExposureConfiguration().forDomainType(com.learning.entity.Book.class)
				.withItemExposure((metadata, http) -> http.disable(unsupportedMethoud))
				.withCollectionExposure((metadata, http) -> http.disable(unsupportedMethoud));
	}
}
