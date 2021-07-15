package com.mayikt.stream;

import java.time.Duration;
import java.time.Instant;
import java.util.OptionalLong;
import java.util.function.LongBinaryOperator;
import java.util.stream.LongStream;

/**
 * @ClassName Test17
 * @Description TODO
 * @Author mao
 * @Data 2021/7/15 14:56
 **/
public class Test17 {
    public static void main(String[] args) {
        Instant start = Instant.now();
        LongStream longStream = LongStream.rangeClosed(0,5000000000L);

        OptionalLong result = longStream.parallel().reduce(new LongBinaryOperator() {
            @Override
            public long applyAsLong(long left, long right) {
                return left + right;
            }
        });
        System.out.println(result.getAsLong());
        Instant end = Instant.now();
        //单线程花费时间 很慢
        System.out.println(Duration.between(start,end).toMillis());
    }
}
