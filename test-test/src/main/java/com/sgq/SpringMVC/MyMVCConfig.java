package com.sgq.SpringMVC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @author siguiqiang
 * @create 2019-1-23
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.sgq.SpringMVC")
public class MyMVCConfig extends WebMvcConfigurerAdapter {
    @Bean
    public InternalResourceViewResolver viewer(){

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/src/main/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

    //addResourceLocations指的是文件暴露的位置，
    //addResourceHandler指的是对外暴露的访问路径
    //必须开启@EnableWebMvc 不然继承的WebMvcConfigurerAdapter 无法生效
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/WEB-INF/views/*").addResourceLocations("/WEB-INF/views/");
//    }
}
