package com.example.hospital.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.example.hospital.interceptor.LoginInterception;

/*@Configuration
public class LoginConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new LoginInterception()).addPathPatterns("/*");
        interceptorRegistration.excludePathPatterns("/index");
        super.addInterceptors(registry);
    }
}*/
