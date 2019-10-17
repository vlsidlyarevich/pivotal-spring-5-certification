package com.github.vlsidlyarevich.spring5_cert.ioc;

/**
 * <b>What do you have to do, if you would like to inject something into a private field? How does this impact testing?</b>
 * <br><br>
 * Field injection - bad way. If you using field injection you can't make fields final. If you annotate field with {@code @Lazy}
 * Spring will try to resolve dependencies as a part of Dependency acyclic graph which will lead to BeanCurrentlyInCreationException.
 * For testing purposes you can use frameworks like PowerMock or Java Reflection Api.
 *
 * @author vlsidlyarevich
 */
public class Q015 {
}
