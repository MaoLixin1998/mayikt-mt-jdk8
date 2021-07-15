package com.mayikt.method;

import com.mayikt.service.AcanthopanaxInterface;
import com.mayikt.service.MessageInterface2;

/**
 * @ClassName Test015
 * @Description TODO
 * @Author mao
 * @Data 2021/7/15 15:35
 **/
public class Test015 {
    public static void main(String[] args) {
        Test015 test015 = new Test015();
        //lambda调用实例方法
       MessageInterface2 messageInterface = () -> test015.object();
        System.out.println(messageInterface.getMessage());

        //方法引入
        MessageInterface2 messageInterface2 = test015::object;
        System.out.println(messageInterface2.getMessage());
    }

    private String object(){
        return "毛利鑫666";
    }
}
