package com.mayikt;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * @ClassName Test020
 * @Description TODO
 * @Author mao
 * @Data 2021/7/15 16:26
 **/
public class Test020 {
    public static void main(String[] args) {
        String username = null;

        Optional<String> optional = Optional.ofNullable(username);
//        boolean present = optional.isPresent();
//        if (present){
//            System.out.println(username);
//        }

        optional.ifPresent(System.out::println);
    }

}
