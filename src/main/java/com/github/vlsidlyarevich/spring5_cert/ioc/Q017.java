package com.github.vlsidlyarevich.spring5_cert.ioc;

/**
 * <b>What is a proxy object and what are the two different types of proxies Spring can create?</b>
 * <br><br>
 * Proxy object is an object which has the same contract as a proxied object and can handle additional logic.
 * Spring can create proxies via Dynamic Proxy and CGLIB.
 *
 * <b>What are the limitations of these proxies (per type)?</b>
 * <br><br>
 * Java Dynamic proxy - a reflective element of the Java language that allows a user to create a proxy of an interface at runtime.
 * Being a part of the reflection package, it is a part of Java and it ships with the JRE/JDK.
 * <br>
 * CGLIB - a code generation library which has the capability to extend Java classes at runtime.
 * Because of this, Spring utilizes this functionality to proxy non-interfaces for its AOP library.
 *
 * <b>What is the power of a proxy object and where are the disadvantages?</b>
 * <br><br>
 * Before Spring 4 CGLIB proxying required default constructor.<br>
 * Calls inside proxied objects affects non-proxied methods, that's why {@code @Transactional} method call will not
 * work inside same class.
 *
 * @author vlsidlyarevich
 */
public class Q017 {
}
