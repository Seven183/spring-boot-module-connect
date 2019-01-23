package com.sgq.Spring.Condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author siguiqiang
 * @create 2019-1-23
 */
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService bean = ac.getBean(ListService.class);

        System.out.println(ac.getEnvironment().getProperty("os.name")+"系统列表名称:"+bean.ShowListService());
    }
}
