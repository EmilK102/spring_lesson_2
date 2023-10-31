package org.example2.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;

@Controller
@EnableAspectJAutoProxy
@ComponentScan("org.example2.aop")
public class MyConfig {
}
