package com.github.vlsidlyarevich.spring5_cert.ioc;

/**
 * <b>How does the {@code @Qualifier} annotation complement the use of {@code @Autowired}?</b>
 * <br><br>
 * If spring have more than one candidate for autowiring and target field is not a collection spring will throw exception.
 * By default autowire by name mechanism is used, if there is some ambiguity in autowiring we can use {@code @Qualifier} annotation.
 * If both {@code @Qualifier} and {@code @Primary} annotation presents {@code @Qualifier} wins.
 *
 * @author vlsidlyarevich
 */
public class Q016 {
}
