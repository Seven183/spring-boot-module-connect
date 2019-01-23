package com.sgq.Spring.Condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author siguiqiang
 * @create 2019-1-23
 */
public class WindowCondition implements Condition {

    @Override
    public boolean matches(ConditionContext Context, AnnotatedTypeMetadata Metadata) {
        return Context.getEnvironment().getProperty("os.name").contains("Windows");
    }
}
