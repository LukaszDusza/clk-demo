package com.clk.clkdemo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class Servlet extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure (SpringApplicationBuilder applicationBuilder){
        return applicationBuilder.sources(ClkDemoApplication.class);
    }

}
