package com.github.vlsidlyarevich.spring5_cert.ioc;

/**
 * <b>Why are you not allowed to annotate a final class with {@code @Configuration}</b>
 * <br><br>
 * Spring uses CGLIB proxying to handle {@code @Configuration} classes. This mechanism is creating subclasses that's why
 * final is restricted.
 * <br><br>
 *
 * <b>How do {@code @Configuration} annotated classes support singleton beans?</b>
 * <br><br>
 * You can annotate {@code @Bean} factory methods with the {@code @Scope} annotation.
 *
 * <br><br>
 * <b>Why can’t {@code @Bean} methods be final either?</b>
 * <br><br>
 * Spring uses CGLIB proxying to handle {@code @Configuration} classes. This mechanism is creating subclasses that's why
 * final is restricted.
 *
 * @author vlsidlyarevich
 */
public class Q020 {
}
