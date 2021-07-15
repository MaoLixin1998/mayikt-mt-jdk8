package com.mayikt.stream;

import com.mayikt.entity.UserEntity;

import java.util.HashSet;

/**
 * @ClassName Test09
 * @Description TODO
 * @Author mao
 * @Data 2021/7/15 11:10
 **/
public class Test09 {
    public static void main(String[] args) {
//        userLists.add(new UserEntity("xiaoming",12));
//        userLists.add(new UserEntity("xiaoming",12));
        UserEntity user1 = new UserEntity("xiaoming", 12);
        UserEntity user2 = new UserEntity("xiaoming", 12);

        String str1 = "xiaoming";
        String str2 = "xiaoming";
        //默认情况下equals()比较两个对象内存地址是否相等
        System.out.println(user1.equals(user2));
        System.out.println(str1.equals(str2));


    }
}
