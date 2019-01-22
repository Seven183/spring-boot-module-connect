package com.sgq.DemoEvent;

import org.springframework.context.ApplicationEvent;

/**
 * @author siguiqiang
 * @create 2019-1-22
 */
public class DemoEvent extends ApplicationEvent {

    private static final long  SerialversionUID = 1L;
    private String meg;

    public DemoEvent(Object source,String meg) {
        super(source);
        this.meg = meg;
    }

    public String getMeg() {
        return meg;
    }

    public void setMeg(String meg) {
        this.meg = meg;
    }
}
