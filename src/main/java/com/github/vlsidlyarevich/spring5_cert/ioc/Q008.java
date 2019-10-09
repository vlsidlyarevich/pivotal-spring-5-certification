package com.github.vlsidlyarevich.spring5_cert.ioc;

/**
 * <b>Can you describe:</b>
 * <br><br>
 * <b>Dependency injection using Java configuration?</b>
 * The central concept of the Java-based configuration is connected with @Configuration and @Bean annotations.
 * The @Bean annotation informs Spring container, that the method will instantiate and configure a new object to be managed by the container.
 * The @Configuration annotation on the class informs Spring container, that the primary purpose of the class is providing the beans.
 * <br><br>
 *
 * <b>Dependency injection using annotations (@Autowired)?</b>
 * The @Autowired on the fields/setters/constructors informs Spring container to search and inject necessary objects into bean in time of creation.
 * Following things has to be considered when using autowiring:
 * Spring tries to resolve candidates by the type first.
 * If multiple candidates exists, Spring tries to resolve the dependency by its name
 * If multiple candidates are found, and Spring cannot decide which should be used, an exception is thrown
 * If no candidates are found, an exception is thrown
 * It is possible to autowire beans collection of the given type
 * If ambiguity exists, we can specify autowire candidate by the @Qualifier or @Primary annotation
 * It is possible to use Java 8 Optional for optional dependencies
 * <br><br>
 *
 * <b>Component scanning, Stereotypes?</b>
 * @Component – most generic stereotype annotation. Other annotations are specializations of the @Component annotation.
 * @Controller – marks a class as an annotated controller. Methods of such class will be used for handling of the incoming http requests.
 * @Service – marks a class as a member of the service layer.
 * @Repository – marks a class as a member of the repository layer.
 * All exception thrown from this class will be wrapped and translated to the Springs DataAccessException.
 * <br><br>
 *
 * <b>Scopes for Spring beans? What is the default scope?</b>
 * @Singleton - the default value of the scope. When the bean is scoped as a singleton,
 * there will be a single instance of that bean in ApplicationContext.
 * If such bean is set as a dependency to multiple other beans, the same instance is provided by the ApplicationContext.
 * @Prototype - when the bean is scoped as a prototype, the ApplicationContext will always create a new instance when such bean is requested.
 * @RequestScope - as the name suggests, the new bean instance will be created for every http request. When the request is processed, the bean instance is discarded.
 * @SessionScope - there will be a single instance per the lifetime of the session. When the session is invalidated, also the bean is discarded.
 * @ApplicationScope -there will be single bean instance pre the ServletContext.
 * It differs from the singleton beans, where single instance exists per Springs ApplicationContext.
 *
 * @author vlsidlyarevich
 */
public class Q008 {
}
