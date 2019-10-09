package com.github.vlsidlyarevich.spring5_cert.ioc;

/**
 * <b>Can you describe:</b>
 * <br><br>
 * <b>Dependency injection using Java configuration?</b><br>
 * The central concept of the Java-based configuration is connected with {@code @Configuration} and {@code @Bean} annotations.
 * The {@code @Bean} annotation informs Spring container, that the method will instantiate and configure a new object to be managed by the container.
 * The {@code @Configuration} annotation on the class informs Spring container, that the primary purpose of the class is providing the beans.
 * <br><br>
 *
 * <b>Dependency injection using annotations {@code (@Autowired)}?</b><br>
 * The {@code @Autowired} on the fields/setters/constructors informs Spring container to search and inject necessary objects into bean in time of creation.
 * Following things has to be considered when using autowiring:
 * <ul>
 * <li>Spring tries to resolve candidates by the type first.
 * <li>If multiple candidates exists, Spring tries to resolve the dependency by its name
 * <li>If multiple candidates are found, and Spring cannot decide which should be used, an exception is thrown
 * <li>If no candidates are found, an exception is thrown
 * <li>It is possible to autowire beans collection of the given type
 * <li>If ambiguity exists, we can specify autowire candidate by the {@code @Qualifier} or {@code @Primary} annotation
 * <li>It is possible to use Java 8 Optional for optional dependencies
 * </ul>
 * <br><br>
 *
 * <b>Component scanning, Stereotypes?</b><br>
 * {@code @Component} – most generic stereotype annotation. Other annotations are specializations of the @Component annotation.<br>
 * {@code @Controller} – marks a class as an annotated controller. Methods of such class will be used for handling of the incoming http requests.<br>
 * {@code @Service} – marks a class as a member of the service layer.<br>
 * {@code @Repository} – marks a class as a member of the repository layer.<br>
 * All exception thrown from this class will be wrapped and translated to the Springs DataAccessException.<br>
 * <br><br>
 *
 * <b>Scopes for Spring beans? What is the default scope?</b><br>
 * {@code @Singleton} - the default value of the scope. When the bean is scoped as a singleton,
 * there will be a single instance of that bean in ApplicationContext.
 * If such bean is set as a dependency to multiple other beans, the same instance is provided by the ApplicationContext.
 * {@code @Prototype} - when the bean is scoped as a prototype, the ApplicationContext will always create a new instance when such bean is requested.<br>
 * {@code @RequestScope} - as the name suggests, the new bean instance will be created for every http request. When the request is processed, the bean instance is discarded.<br>
 * {@code @SessionScope} - there will be a single instance per the lifetime of the session. When the session is invalidated, also the bean is discarded.<br>
 * {@code @ApplicationScope} -there will be single bean instance pre the ServletContext.
 * It differs from the singleton beans, where single instance exists per Springs ApplicationContext.<br>
 *
 * @author vlsidlyarevich
 */
public class Q008 {
}
