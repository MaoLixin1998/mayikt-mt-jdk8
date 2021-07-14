package com.mayikt;

/**
 * @ClassName Test01
 * @Description TODO
 * @Author mao
 * @Data 2021/7/14 16:26
 **/
public class Test01 {

    public static void main(String[] args) {
        JDK8Interface jdk8Interface = new JDK8InterfaceImpl();
        jdk8Interface.defaultGet();
        jdk8Interface.add();

        //不能通过jdk8Interface来调用
        JDK8Interface.staticDel();
    }
}
