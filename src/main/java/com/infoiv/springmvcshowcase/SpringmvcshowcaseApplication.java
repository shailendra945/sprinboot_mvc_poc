package com.infoiv.springmvcshowcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@SpringBootApplication
public class SpringmvcshowcaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmvcshowcaseApplication.class, args);
	}

	/*@Bean
	@Primary
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver internalSrcViewResol=new InternalResourceViewResolver();
		internalSrcViewResol.setPrefix("/WEB-INF/view");
		internalSrcViewResol.setSuffix(".jsp");
		internalSrcViewResol.setViewClass(JstlView.class);
		return internalSrcViewResol;
	}*/
}

