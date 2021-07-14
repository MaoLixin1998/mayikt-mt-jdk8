package com.mayikt;

import com.mayikt.service.AcanthopanaxInterface;

/**
 * @ClassName Test03
 * @Description TODO
 * @Author mao
 * @Data 2021/7/14 17:14
 **/
public class Test03 {
    public static void main(String[] args) {
        new AcanthopanaxInterface(){

            @Override
            public void get() {
                System.out.println("get");
            }
        }.get();
        AcanthopanaxInterface acanthopanaxInterface = () -> {
            System.out.println("使用lambda表达式写法");
        };

        acanthopanaxInterface.get();
    }
}
