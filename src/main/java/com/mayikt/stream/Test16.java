package com.mayikt.stream;

import java.time.Duration;
import java.time.Instant;

/**
 * @ClassName Test16
 * @Description TODO
 * @Author mao
 * @Data 2021/7/15 14:52
 **/
public class Test16 {
    public static void main(String[] args) {
        Instant start = Instant.now();
        long sum = 0;
        for (int i = 0; i < 5000000000L; i++) {
            sum += i;
        }
        System.out.println(sum);
        Instant end = Instant.now();
        //单线程花费时间 很慢
        System.out.println(Duration.between(start,end).toMillis());
    }
}
