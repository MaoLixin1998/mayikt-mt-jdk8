package com.mayikt.stream;

import com.mayikt.entity.UserEntity;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName Test02
 * @Description TODO
 * @Author mao
 * @Data 2021/7/15 13:36
 **/
public class Test02 {
    public static void main(String[] args) {
        ArrayList<UserEntity> userLists = new ArrayList<>();

        userLists.add(new UserEntity("xiaoming", 12));
        userLists.add(new UserEntity("xiaoxun", 23));
        userLists.add(new UserEntity("xiaoli", 25));
        userLists.add(new UserEntity("xiaowang", 15));

        Stream<UserEntity> stream = userLists.stream();
        /**
         *
         */
        Map<String, UserEntity> collect = stream.collect(Collectors.toMap(userEntity -> userEntity.getUsername(), userEntity -> userEntity));

        collect.forEach((s, userEntity) -> System.out.println(s + "," + userEntity));

    }
}
