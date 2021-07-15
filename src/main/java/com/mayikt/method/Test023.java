package com.mayikt.method;

import java.util.function.Function;

/**
 * @ClassName Test023
 * @Description TODO
 * @Author mao
 * @Data 2021/7/15 15:53
 **/
public class Test023 {
    public static void main(String[] args) {
        Function<String,Integer> function = (str) -> str.length();
        Function<String,Integer> function2 = String::length;
    }
}
