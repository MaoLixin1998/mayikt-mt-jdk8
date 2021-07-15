package com.mayikt.stream;

import com.mayikt.entity.UserEntity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @ClassName Test08
 * @Description TODO
 * @Author mao
 * @Data 2021/7/15 14:42
 **/
public class Test08 {
    public static void main(String[] args) {
        ArrayList<UserEntity> userEntities = new ArrayList<>();

        userEntities.add(new UserEntity("xiaoming", 12));
        userEntities.add(new UserEntity("xiaoxun", 23));
        userEntities.add(new UserEntity("xiaoli", 25));
        userEntities.add(new UserEntity("xiaowang", 15));
        userEntities.add(new UserEntity("xiaowang", 88));
        userEntities.add(new UserEntity("xiaowang", 23));
        //要求对数据实现降序排序，名称为xiaowang,前两位

        Stream<UserEntity> stream = userEntities.stream();
        stream.sorted((o1, o2) -> o2.getAge()- o1.getAge())
                .filter(userEntity -> "xiaowang".equals(userEntity.getUsername()))
                .limit(2)
                .forEach(s-> System.out.println(s));
    }

}
