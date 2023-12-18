package com.example.app4.filter;

import jakarta.servlet.Filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GZIPFilterConfig {

    @Bean
    public FilterRegistrationBean<Filter> gzipFilter() {
        FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new GZIPFilter());
        registrationBean.addUrlPatterns("/*"); // Define URL patterns to apply the filter
        return registrationBean;
    }
}

