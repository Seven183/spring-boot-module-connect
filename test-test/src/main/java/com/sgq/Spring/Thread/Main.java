package com.sgq.Spring.Thread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author siguiqiang
 * @create 2019-1-22
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(TaskConfig.class);
        AsyncTaskService bean = annotationConfigApplicationContext.getBean(AsyncTaskService.class);

        for (int i=0;i<10;i++){

            bean.ExecutorAsyncTask(i);
            bean.ExecutorAsyncTaskPlus(i);
        }
        annotationConfigApplicationContext.close();
    }
}
