package com.wying.rpc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * description:
 * date: 2020/7/21
 * author: gaom
 * version: 1.0
 */
public class RpcStart {
    public  static  void  main(String args[]){
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        context.start();
        System.out.println("rpc server start success!!!");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入指令 exit指令关闭rpc server..");
        while (scanner.hasNextLine()) {
            String str =scanner.nextLine();
            System.out.println("input:"+str);
            System.out.println(str);
            if("exit".equals(str)){
                System.out.println("stop RpcService....");
                System.exit(0);
            }
        }
    }
}
