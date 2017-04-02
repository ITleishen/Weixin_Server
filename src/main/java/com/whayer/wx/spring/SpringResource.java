package com.whayer.wx.spring;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class SpringResource implements ApplicationContextAware{
	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	public void getResource() throws IOException {
		Resource resource = applicationContext.getResource("classpath:test/1.txt");
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
	}

}
