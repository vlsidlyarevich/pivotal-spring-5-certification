package com.github.vlsidlyarevich.spring5_cert.ioc;

/**
 * <b>What is the behavior of the annotation {@code @Autowired} with regards to field injection,
 * constructor injection and method injection?</b>
 * <br><br>
 * <ul>
 * <li> Field injection - bad way. If you using field injection you can't make fields final. If you annotate field with {@code @Lazy}
 * Spring will try to resolve dependencies as a part of Dependency acyclic graph which will lead to BeanCurrentlyInCreationException.
 * <li> Method injection - boilerplate way. It is not resolved as DAG and it enables circular dependencies. You can't declare fields as final.
 * Also this injection violates encapsulation.
 * <li> Constructor injection - preferred way. Allows to use final fields. It is prone to circular dependencies issues.
 * </ul>
 *
 * @author vlsidlyarevich
 */
public class Q014 {
}
