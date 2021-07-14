package com.mayikt;

/**
 * @ClassName JDK8InterfaceImpl
 * @Description TODO
 * @Author mao
 * @Data 2021/7/14 16:25
 **/
public class JDK8InterfaceImpl implements JDK8Interface {

    /**
     * 没有强制要求重写，默认和静态方法
     */
    @Override
    public void add() {
        System.out.println("add");
    }
}
