package com.jshiffler.webstore.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


//Creates the Dispatcher Servlet with no need for a web.xml file.
public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	
		
	@Override
	protected Class<?>[] getServletConfigClasses(){
		return new Class[]{
			WebApplicationContextConfig.class};
	}
	
	@Override
	protected String[] getServletMappings(){
		return new String[]{"/"};
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
