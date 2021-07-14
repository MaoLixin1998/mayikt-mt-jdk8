package com.mayikt;

/**
 * @ClassName com.mayikt.JDK8Interface
 * @Description TODO
 * @Author mao
 * @Data 2021/7/14 16:20
 **/
public interface JDK8Interface {
    /**
     * 默认的时候就是public ,abstrac
     */
    void add();

    default void defaultGet(){
        System.out.println("defaultGet");
    }

    static void staticDel(){
        System.out.println("staticDel");
    }
}
