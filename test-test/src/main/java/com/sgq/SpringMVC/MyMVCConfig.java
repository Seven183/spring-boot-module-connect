package com.sgq.SpringMVC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.ArrayList;
import java.util.List;

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
        resolver.setPrefix("/WEB-INF/views/");
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
//    @Bean
//    public HandlerAdapter initRequestMappingHandlerAdapter(){
//        RequestMappingHandlerAdapter ad = new RequestMappingHandlerAdapter();
//        MappingJackson2HttpMessageConverter maJ = new MappingJackson2HttpMessageConverter();
//        mediaType = MediaType.APPLICATION_JSON_VALUE;
//        List<MediaType> mediaTypes = new ArrayList<MediaType>();
//        mediaTypes.add(mediaType);
//        maJ.setSupportedMediaTypes(mediaTypes);
//        ad.getMessageConverters().add(maJ);
//        return ad;
//    }
}
