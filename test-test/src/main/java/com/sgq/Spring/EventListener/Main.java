package com.sgq.Spring.EventListener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author siguiqiang
 * @create 2019-1-22
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublish bean = ac.getBean(DemoPublish.class);
        bean.publish("fdskfk");

        ac.close();
    }
}
