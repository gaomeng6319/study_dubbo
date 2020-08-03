package com.wying.rpc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * description:
 * date: 2020/7/21
 * author: gaom
 * version: 1.0
 */
public class RpcInvoke {

    public static void main( String[] args )  {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();
        RpcService rpcService = (RpcService) context.getBean("rpcService");
        System.out.println("rpc client start success !!!");
        String rtn = "";


        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入testMethod1参数 exit指令关闭rpc client..");
        while (scanner.hasNextLine()) {
            String str =scanner.nextLine();
            System.out.println("input:"+str);
            if("exit".equals(str)){
                System.out.println("stop RpcService....");
                System.exit(0);
                return;
            }
            rtn = rpcService.testMethod1(str);
            System.out.println("rpcService.testMethod1  :"+rtn);
        }
    }
}
