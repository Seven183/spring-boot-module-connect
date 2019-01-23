package com.sgq.Spring.Condition;

import org.springframework.stereotype.Service;

/**
 * @author siguiqiang
 * @create 2019-1-23
 */
public class WindowService implements ListService{

    @Override
    public String ShowListService() {
        return "dir";
    }
}
