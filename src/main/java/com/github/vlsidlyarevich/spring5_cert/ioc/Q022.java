package com.github.vlsidlyarevich.spring5_cert.ioc;

/**
 * <b>Can you use @Bean together with {@code @Profile?}</b>
 * <br><br>
 * Yes, but there is a special case scenario: <p>
 * In the case of overloaded @Bean methods of the same Java method name (analogous to constructor overloading),
 * an @Profile condition needs to be consistently declared on all overloaded methods.
 * If the conditions are inconsistent, only the condition on the first declaration among the overloaded methods will matter.
 *
 * @author vlsidlyarevich
 */
public class Q022 {
}
