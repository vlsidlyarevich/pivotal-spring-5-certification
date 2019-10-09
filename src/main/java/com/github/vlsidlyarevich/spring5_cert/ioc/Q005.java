package com.github.vlsidlyarevich.spring5_cert.ioc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;

/**
 * <b>Can you describe the lifecycle of a Spring Bean in an {@link ApplicationContext}?</b>
 * <br><br>
 * <ul>
 * <li>1. Bean definition is loaded from the configuration
 * <li>2. Bean definition is processed by the BeanFactoryPostProcessors
 * <li>3. Bean instance is created. Required dependencies are provided and set by the container
 * <li>4. All optional dependencies are provided and set by the container
 * <li>5. Bean is processed by the {@link BeanPostProcessor#postProcessBeforeInitialization(Object, String)}
 * <li>6. Initialization callbacks are executed (in order {@code @PostConstruct} annotation, {@link InitializingBean#afterPropertiesSet()}
 * method and custom configured init() method).
 * <li>7. Bean is processed by the {@link BeanPostProcessor#postProcessAfterInitialization(Object, String)}
 * <li>8. The container and all the beans are now ready to be used.
 * <li>9. When the application is stopped, destroy callbacks are executed (in order {@code @PreDestroy} annotation, {@link DisposableBean#destroy()}
 * method and custom configured destroy() method). Destroy callbacks are not called for the Prototype scoped beans!
 * </ul>
 *
 * @author vlsidlyarevich
 */
public class Q005 {
}
