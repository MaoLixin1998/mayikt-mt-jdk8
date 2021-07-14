package com.mayikt.service;

/**
 * @ClassName MyFunctionInterface
 * @Description TODO
 * @Author mao
 * @Data 2021/7/14 16:44
 **/
@FunctionalInterface
public interface MyFunctionInterface {
    void get();

    default void add(){
        System.out.println("我是抽象方法");
    }

    /**
     * object弗雷中的方法可以在函数接口中重写
     * @return
     */
    String toString();
}
