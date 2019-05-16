package com.MyUniApp.MyUniAppBack;

import com.MyUniApp.MyUniAppBack.Config.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;


@SpringBootApplication()

public class MyUniAppBackApplication {

	@Bean
	public FilterRegistrationBean jwtFilter(){
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter( new JwtFilter() );
		registrationBean.addUrlPatterns("/news/*", "/users/*", "/users");

		return registrationBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(MyUniAppBackApplication.class, args);
	}

}
