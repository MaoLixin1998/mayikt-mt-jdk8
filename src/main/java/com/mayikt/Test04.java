package com.mayikt;

import com.mayikt.service.YouShenInterface;

public class Test04 {
    public static void main(String[] args) {
        //有参调用
        YouShenInterface youShenInterface = new YouShenInterface() {
            @Override
            public String get(int i, int j) {
                return i + "---" + j;
            }
        };
        System.out.println(youShenInterface.get(1, 2));

        //lambda表达式写法
        YouShenInterface youShenInterface1 =  (i,j)->{
            return i + "---" + j;
        };
        System.out.println(youShenInterface1.get(1, 1));
    }
}
