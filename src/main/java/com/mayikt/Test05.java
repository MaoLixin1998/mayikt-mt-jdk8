package com.mayikt;

import com.mayikt.service.AcanthopanaxInterface;
import com.mayikt.service.YouShenInterface;

/**
 * Lambda精简写法
 */
public class Test05 {
    //
    public static void main(String[] args) {
        AcanthopanaxInterface acanthopanaxInterface = () -> System.out.println("我是方法");

        acanthopanaxInterface.get();

        ((AcanthopanaxInterface)() -> System.out.println("我是方法")).get();

        YouShenInterface youShenInterface =(i,j)->{
            return i + "---" + j;
        };


        YouShenInterface youShenInterface1 =(i,j)-> i + "---" + j;


        ((YouShenInterface)(i,j) -> i + "---" + j).get(1,2);
    }
}
