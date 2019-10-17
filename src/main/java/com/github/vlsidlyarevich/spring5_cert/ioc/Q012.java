package com.github.vlsidlyarevich.spring5_cert.ioc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * <b>What is a {@link BeanPostProcessor} and how is it different to a {@link BeanFactoryPostProcessor}?</b>
 * <br><br>
 * The purpose of it is to process the beans created by the {@link ApplicationContext} after instantiation but before
 * exposing them for usage.
 * <br><br>
 *
 * <b>What do they do? When they are called?</b>
 * <br><br>
 * {@link BeanPostProcessor} is modifying newly created bean instances, while {@link BeanFactoryPostProcessor} is operating on
 * bean definitions.
 * {@link BeanPostProcessor} contains two hooks:
 * <ul>
 * <li> {@code default Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {}}
 * <li> {@code default Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {}}
 * </ul>
 * {@code postProcessBeforeInitialization} hook is called before initialization callbacks. It can wrap bean to a proxy instance,
 * and always working on pure object.
 * {@code postProcessAfterInitialization} hook is called after initialization callbacks. In most times it will handle on
 * proxy objects.
 * <br><br>
 *
 * <b>What is an initialization method and how is it declared on a Spring Bean?</b>
 * <br><br>
 * Spring have multi-staged constructor for Beans, at the constructor bean is not instantiated fully, and to apply some logic
 * on bean which contains all the dependencies initialization method is used. {@link PostConstruct}
 * <br><br>
 *
 * <b>What is a destroy method, how is it declared and when is it called?</b>
 * <br><br>
 * {@link PreDestroy} is used to apply some custom logic before bean destruction.
 * <br><br>
 *
 * <b>Consider how you enable JSR-250 annotations like {@code @PostConstruct} and {@code @PreDestroy?} When/how will they get called?</b>
 * <br><br>
 * This callbacks are recognized by {@link CommonAnnotationBeanPostProcessor} which is enabled when annotation config or component scan.
 * <br><br>
 *
 * <b>How else can you define an initialization or destruction method for a Spring bean?</b>
 * <br><br>
 * Except {@link Bean#initMethod()} and {@code @PostConstruct} there is an interfaces like {@link InitializingBean} and {@link DisposableBean}.
 * <br><br>
 *
 * @see com.github.vlsidlyarevich.spring5_cert.ioc.examples.JSR250Example
 * @author vlsidlyarevich
 */
public class Q012 {
}
