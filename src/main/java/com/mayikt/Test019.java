package com.mayikt;

import java.util.Optional;
import java.util.function.Predicate;

/**
 * @ClassName Test019
 * @Description TODO
 * @Author mao
 * @Data 2021/7/15 16:15
 **/
public class Test019 {
    public static void main(String[] args) {
        String userName = "mao";
        /**
         * ofNullable可以允许传递空值
         * of不允许传递空值
         */
//        Optional<String> optional = Optional.ofNullable(userName);
//        Optional<String> optional = Optional.of(userName);
//        System.out.println(optional.get());
//        boolean present = optional.isPresent();
        //返回false为空，true不为空
//        System.out.println(present);

        //设定默认值
//        String uName = Optional.ofNullable(userName).orElse("mao");
//        System.out.println(uName);

        //过滤器
        boolean f = Optional.ofNullable(userName).filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return "mao".equals(s);
            }
        }).isPresent();

        System.out.println(f);


    }
}
