package com.mayikt.method;

import com.mayikt.entity.MessageEntity;
import com.mayikt.service.AcanthopanaxInterface;
import com.mayikt.service.MessageInterface3;

/**
 * @ClassName Test02
 * @Description TODO
 * @Author mao
 * @Data 2021/7/15 15:42
 **/
public class Test02 {
    public static void main(String[] args) {
        //lambda调用构造方法
        MessageInterface3 messageInterface = () -> new MessageEntity();

        //方法引入构造函数
        MessageInterface3 messageInterface3 = MessageEntity::new;
    }
}
