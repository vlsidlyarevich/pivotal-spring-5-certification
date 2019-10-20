package com.github.vlsidlyarevich.spring5_cert.ioc;

/**
 * <b>What is the default bean id if you only use @Bean? How can you override this?</b>
 * <br><br>
 * By default, configuration classes use a @Bean method’s name as the name of the resulting bean.
 * This functionality can be overridden, however, with the {@code @Name} annotation.
 * it is sometimes desirable to give a single bean multiple names, otherwise known as bean aliasing.
 * The name attribute of the @Bean annotation accepts a String array for this purpose.
 *
 * @author vlsidlyarevich
 */
public class Q019 {
}
