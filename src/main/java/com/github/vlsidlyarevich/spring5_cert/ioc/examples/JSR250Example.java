package com.github.vlsidlyarevich.spring5_cert.ioc.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JSR250Example {

    @Bean(initMethod = "toString")
    public String bean1() {
        return "";
    }

    @Bean(destroyMethod = "toString")
    public String bean2() {
        return "";
    }
}
