package com.mayikt.stream;

import com.mayikt.entity.UserEntity;

import java.util.ArrayList;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName Test01
 * @Description TODO
 * @Author mao
 * @Data 2021/7/15 10:49
 **/
public class Test01 {

    public static void main(String[] args) {
        ArrayList<UserEntity> userLists = new ArrayList<>();

        userLists.add(new UserEntity("xiaoming",12));
        userLists.add(new UserEntity("xiaoxun",23));

        //两个xu内存地址不一样
        UserEntity user = new UserEntity("xu", 6);
        userLists.add(user);
        userLists.add(user);

        userLists.forEach(t -> System.out.println(t.toString()));


        /**
         * 创建stream的两种方式
         * 1. 串行流stream()
         * 2. 并行流parallelStream()
         */
        Stream<UserEntity> stream = userLists.stream();
        Set<UserEntity> setUserList = stream.collect(Collectors.toSet());
        setUserList.forEach(userEntity -> {
            System.out.println(userEntity.toString());
        });


    }
}
