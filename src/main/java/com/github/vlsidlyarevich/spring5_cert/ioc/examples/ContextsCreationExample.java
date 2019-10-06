package com.github.vlsidlyarevich.spring5_cert.ioc.examples;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class ContextsCreationExample {

    public static void main(String[] args) {
        // Loading XML configuration from the class path
        ApplicationContext context1 = new ClassPathXmlApplicationContext("bean-definitions.xml");
        // Loading XML configuration from the file
        ApplicationContext context2 = new FileSystemXmlApplicationContext("path/to/bean-definitions.xml");
        // Loading Java based configuration
        ApplicationContext context3 = new AnnotationConfigApplicationContext(BeanDefinitions.class);
        // Loading Java based configuration of the web application
        ApplicationContext context4 = new AnnotationConfigWebApplicationContext();
    }
}
