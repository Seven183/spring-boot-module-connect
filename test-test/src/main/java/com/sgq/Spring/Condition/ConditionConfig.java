package com.sgq.Spring.Condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author siguiqiang
 * @create 2019-1-23
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowCondition.class)
    public ListService WindowService(){
        return new WindowService();
    }

    @Bean
    @Conditional(LinuxConditon.class)
    public ListService LinuxService(){
        return new LinuxService();
    }
}
