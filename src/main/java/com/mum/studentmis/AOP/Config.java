package com.mum.studentmis.AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.mum.studentmis.service")
@EnableAspectJAutoProxy
public class Config {
}
