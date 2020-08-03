package com.wying.rpc;

/**
 * description:
 * date: 2020/7/21
 * author: gaom
 * version: 1.0
 */
public class RpcServiceImpl  implements  RpcService{
    @Override
    public String testMethod1(String name) {
        System.out.println("provider RpcServiceImpl testMethod1:"+name);
        return "testMethod1:"+name;
    }
}
