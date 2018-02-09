package org.msharma.spring.config;

import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


/**
 * @author Mohan Sharma Created on 07/02/18.
 */

@Configuration
public class CustomDispatcherServlet
{
	@Bean
	public ServletRegistrationBean dispatcherServlet()
	{
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		appContext.setConfigLocation("org.msharma");
		DispatcherServlet dispatcherServlet = new DispatcherServlet();
		dispatcherServlet.setApplicationContext(appContext);
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(dispatcherServlet, "/");
		registrationBean.setLoadOnStartup(1);
		registrationBean.setName(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_REGISTRATION_BEAN_NAME);
		return registrationBean;
	}
}
