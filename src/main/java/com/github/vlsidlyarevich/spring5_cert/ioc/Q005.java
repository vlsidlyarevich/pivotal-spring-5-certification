package com.github.vlsidlyarevich.spring5_cert.ioc;

/**
 * <b>Can you describe the lifecycle of a Spring Bean in an ApplicationContext?</b>
 * <br><br>
 * 1. Bean definition is loaded from the configuration
 * 2. Bean definition is processed by the BeanFactoryPostProcessors
 * 3. Bean instance is created. Required dependencies are provided and set by the container
 * 4. All optional dependencies are provided and set by the container
 * 5. Bean is processed by the BeanPostProcessor#postProcessBeforeInitialization()
 * 6. Initialization callbacks are executed (in order @PostConstruct annotation, InitializingBean#afterPropertiesSet() method and custom configured init() method).
 * 7. Bean is processed by the BeanPostProcessor#postProcessAfterInitialization()
 * 8. The container and all the beans are now ready to be used.
 * 9. When the application is stopped, destroy callbacks are executed (in order @PreDestroy annotation, DisposableBean#destroy()
 * method and custom configured destroy() method). Destroy callbacks are not called for the Prototype scoped beans!
 *
 * @author vlsidlyarevich
 */
public class Q005 {
}
