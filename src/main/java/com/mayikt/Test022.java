package com.mayikt;

import com.mayikt.entity.OrderEntity;

import java.util.Optional;
import java.util.function.Function;

/**
 * @ClassName Test022
 * @Description TODO
 * @Author mao
 * @Data 2021/7/15 16:48
 **/
public class Test022 {

    public static void main(String[] args) {
        OrderEntity order = new OrderEntity("123456","mao");

        Optional<String> optional = Optional.ofNullable(order).map(orderEntity -> orderEntity.getOrderName());
        Optional<String> toLowerCase = optional.map(String::toLowerCase);
        System.out.println(toLowerCase.get());
    }
}
