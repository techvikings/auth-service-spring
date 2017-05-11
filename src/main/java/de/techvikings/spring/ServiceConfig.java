package de.techvikings.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"org.baeldung.service"})
public class ServiceConfig {
}
