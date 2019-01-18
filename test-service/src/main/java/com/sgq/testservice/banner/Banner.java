package com.sgq.testservice.banner;

import org.springframework.core.env.Environment;

import java.io.PrintStream;

/**
 * @author siguiqiang
 * @create 2019-1-18
 */
public class Banner implements org.springframework.boot.Banner {
    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {

        out.println("pppppppp");
    }
}
