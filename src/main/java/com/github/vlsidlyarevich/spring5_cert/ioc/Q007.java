package com.github.vlsidlyarevich.spring5_cert.ioc;

/**
 * <b>What is the preferred way to close an application context? Does Spring Boot do this for you?</b>
 * <br><br>
 * In a non-web application you can register JVM hook, and then Spring gracefully will call destroy
 * callbacks (non-working on prototype beans). If you are using Spring Boot, then it will register this hook automatically for you.
 *
 * @author vlsidlyarevich
 * @see com.github.vlsidlyarevich.spring5_cert.ioc.examples.ContextShutdownExample
 */
public class Q007 {
}
