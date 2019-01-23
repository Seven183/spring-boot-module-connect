package com.sgq.Spring.Condition;

/**
 * @author siguiqiang
 * @create 2019-1-23
 */

public class LinuxService implements ListService{
    @Override
    public String ShowListService() {
        return "ls";
    }
}
