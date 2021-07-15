package com.mayikt;

import com.mayikt.entity.UserEntity;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @ClassName Test07
 * @Description TODO
 * @Author mao
 * @Data 2021/7/15 9:41
 **/
public class Test07 {

    public static void main(String[] args) {
        ArrayList<UserEntity> userLists = new ArrayList<>();

        userLists.add(new UserEntity("xiaoming",12));
        userLists.add(new UserEntity("xiaoxun",23));
        userLists.add(new UserEntity("xu",6));

        userLists.sort(new Comparator<UserEntity>() {
            @Override
            public int compare(UserEntity o1, UserEntity o2) {
                return o1.getAge()-o2.getAge();
            }
        });


        userLists.sort((o1, o2) -> o1.getAge()-o2.getAge());

        userLists.forEach(s -> System.out.println(s.toString()));
    }
}
