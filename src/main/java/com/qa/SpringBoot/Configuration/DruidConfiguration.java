package com.qa.SpringBoot.Configuration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;



@Configuration
public class DruidConfiguration {

	
	public  DataSource     getDruidDateSource(){
		
		
		return  new  DruidDataSource();
	}
	
	 @Bean
	    public ServletRegistrationBean statViewServlet(){
	        ServletRegistrationBean bean=new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
	        Map<String,String> initParams = new HashMap<String,String>();
	        initParams.put("loginUsername","李轩辕");
	        initParams.put("loginPassword","0914");
	        initParams.put("allow","");//默认就是允许所有访问
	        initParams.put("deny","192.168.15.21");//deny：不能访问
	        bean.setInitParameters(initParams);
	        return bean;
	    }
	    //2、配置一个web监控的filter
	    @Bean
	    public FilterRegistrationBean webStatFilter(){
	        FilterRegistrationBean bean = new FilterRegistrationBean();
	        bean.setFilter(new WebStatFilter());
	
	        Map<String,String> initParams = new HashMap<>();
	        initParams.put("exclusions","*.js,*.css,/druid/*");
	        bean.setInitParameters(initParams);
	        bean.setUrlPatterns(Arrays.asList("/*"));
	        return  bean;
	    }
		





}
