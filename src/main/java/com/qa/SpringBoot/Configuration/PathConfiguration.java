package com.qa.SpringBoot.Configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration
public class PathConfiguration {
        
	
	@Bean
	public WebMvcConfigurer webMvcConfigurer(){
		WebMvcConfigurer configurer = new WebMvcConfigurer(){
		
			
			 public void addResourceHandlers(ResourceHandlerRegistry registry) {
			                 
			     registry.addResourceHandler("/file/**").addResourceLocations("file:C:/Users/Public/Pictures/Sample Pictures/");
			     registry.addResourceHandler("/img/**").addResourceLocations("file:E:/视频/mgj/update/");
			}

		
	};
		
	
		return configurer;
	}


	
	
	
	
	
	
}
