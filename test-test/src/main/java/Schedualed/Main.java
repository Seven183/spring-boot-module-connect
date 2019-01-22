package Schedualed;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author siguiqiang
 * @create 2019-1-22
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SchedualedConfig.class);
        //SchedualTaskService bean = ac.getBean(SchedualTaskService.class);
        //System.out.println(bean);

        ac.close();
    }
}

