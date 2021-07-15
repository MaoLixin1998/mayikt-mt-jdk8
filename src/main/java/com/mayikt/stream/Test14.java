package com.mayikt.stream;

import com.mayikt.entity.UserEntity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @ClassName Test14
 * @Description TODO
 * @Author mao
 * @Data 2021/7/15 14:28
 **/
public class Test14 {

    public static void main(String[] args) {
        ArrayList<UserEntity> userLists = new ArrayList<>();

        userLists.add(new UserEntity("xiaoming", 12));
        userLists.add(new UserEntity("xiaoxun", 23));
        userLists.add(new UserEntity("xiaoli", 25));
        userLists.add(new UserEntity("xiaowang", 15));

        Stream<UserEntity> stream = userLists.stream();
//        stream.filter(userEntity -> "xiaoming".equals(userEntity.getUsername()))
//                .forEach(userEntity -> System.out.println(userEntity));

        stream.sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .forEach(s -> System.out.println(s));
    }
}
