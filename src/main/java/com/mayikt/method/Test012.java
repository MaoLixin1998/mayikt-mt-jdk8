package com.mayikt.method;

import com.mayikt.service.MessageInterface;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @ClassName Test012
 * @Description TODO
 * @Author mao
 * @Data 2021/7/15 15:18
 **/
public class Test012 {
    public static void main(String[] args) {
        //传统
        MessageInterface messageInterface = new MessageInterface() {

            @Override
            public void get(Integer a) {
                System.out.println("get"+ a);
            }
        };
        messageInterface.get(1);
        //lambda
        MessageInterface messageInterface1 = a -> Test012.staticGet(a);
        messageInterface1.get(2);
        //方法引入
        MessageInterface messageInterface2 = Test012::staticGet;
        messageInterface2.get(3);
        /**
         * Test012::staticGet;
         * a -> Test012.staticGet(a);
         * 返回类型和参数类型必须一样
         */
    }

    public static void staticGet(Integer a){
        System.out.println("staticGet" + a);
    }
}
