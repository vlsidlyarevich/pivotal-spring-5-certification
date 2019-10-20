package com.github.vlsidlyarevich.spring5_cert.ioc;

/**
 * <b>What does the {@code @Bean} annotation do?</b>
 * <br><br>
 * This annotation indicates that a method produces a bean to be managed by the Spring container.
 * Inside {@code @Configuration} annotated class this method will be intercepted by CGLIB-based proxy and all calls
 * to this method will return fully-instantiated bean.
 * <br>
 * Inside non-configuration classes beans created in "lite" mode, calls to this methods will be handled by java semantics, not
 * Spring container itself.
 *
 * @author vlsidlyarevich
 */
public class Q018 {
}
