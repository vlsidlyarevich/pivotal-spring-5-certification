package com.github.vlsidlyarevich.spring5_cert.ioc;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySources;

/**
 * <b>What is a {@link BeanFactoryPostProcessor} and what is it used for? When is it invoked?</b>
 * <br><br>
 * A {@link BeanFactoryPostProcessor} may interact with and modify bean
 * definitions, but never bean instances. Doing so may cause premature bean
 * instantiation, violating the container and causing unintended side-effects.
 * <br><br>
 *
 * <b>Why would you define a static {@code @Bean} method?</b>
 * <br><br>
 * Special consideration must be taken for @Bean methods that return Spring BeanFactoryPostProcessor (BFPP) types.
 * Because BFPP objects must be instantiated very early in the container lifecycle, they can interfere with processing
 * of annotations such as {@code @Autowired}, {@code @Value}, and {@code @PostConstruct} within {@code @Configuration} classes.
 * To avoid these lifecycle issues, mark BFPP-returning @Bean methods as static
 * <br><br>
 *
 * <b>What is a {@link PropertySourcesPlaceholderConfigurer} used for?</b>
 * <br><br>
 * Implementation of {@link BeanFactoryPostProcessor} that resolves ${...} placeholders
 * within bean definition property values and {@code @Value} annotations against the current
 * Spring {@link Environment} and its set of {@link PropertySources}.
 *
 * @author vlsidlyarevich
 */
public class Q011 {
}
